/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//[code lang="java"]
package appstegano;

import java.math.BigInteger;
import java.util.Vector;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Nisak
 * @author GilangMF
 */
public class VigenereChipper {

    char mapPesanCr[] = {' ','\n','A', 'B', 'C', 'D', 'E', 
                        'F', 'G', 'H', 'I', 'J', 'K', 'L', 
                        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
                        'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    char mapHasilCr[] = {' ','\n','ا', 'ب', 'ث', 'د', 'ع', 
                        'ف', 'غ', 'ه', 'ح', 'ج', 'ك', 'ل',
                        'م', 'ن', 'ط', 'ظ', 'ق', 'ر', 'س',
                        'ت', 'ص', 'ض', 'و', 'ش', 'ي', 'ز'};
    
    char chPass;
    char chPesan;

    int nilaiPesan = 0;
    int nilaiPass = 0;
    int[] hasilEnkrip;
    int hasilDekripsi[];

    String hasilEnkripsiStr;
    String hasilDekripsiStr;

    /**
     * Encrypts the given plaintext using the specified key.
     *
     * @param text
     * @return
     */
    public static String format(String text) {
        return text.toUpperCase().replaceAll("[^\\p{L]", "");
    }

    public String generateKey(String text, String key) {
        char[] newKey = new char[text.length()];
        int repeatFlag = 0;
        for (int i = 0; i < newKey.length; i++) {
            if (text.charAt(i) == ' ') {
                newKey[i] = ' ';
            } else {
                newKey[i] = key.charAt(repeatFlag);
                if (repeatFlag + 1 == key.length()) {
                    repeatFlag = 0;
                } else {
                    repeatFlag++;
                }
            }
        }
        return new String(newKey);
    }

    public boolean keyHasSpace(String key) {
        boolean answer = false;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                answer = true;
                break;
            }
        }
        return answer;
    }

    public void ekstrakEnkripsi(String plainText, String keyword) {

        plainText = plainText.toUpperCase();
//        System.out.println("plain " + plainText);
        keyword = generateKey(plainText, keyword);
        hasilEnkrip = new int[plainText.length()];
//        char[] chPesan = new char[plainText.length()];

        for (int i = 0; i < plainText.length(); i++) {

            chPesan = plainText.charAt(i);
            chPass = keyword.charAt(i % keyword.length());

            for (int j = 0; j < mapPesanCr.length; j++) {
                if (chPesan == mapPesanCr[j]) {
                    nilaiPesan = j;
                    System.out.println("Message Value : " + chPesan + " : " + j);
                }
                if (chPass == mapPesanCr[j]) {
                    nilaiPass = j;
                    System.out.println("Pass Value : " + chPass + " : " + j);
                }
            }
            hasilEnkrip[i] = nilaiPesan + nilaiPass;
            System.out.println("Value : " + hasilEnkrip[i]);
            if (hasilEnkrip[i] > mapPesanCr.length) {
                hasilEnkrip[i] = hasilEnkrip[i] - mapPesanCr.length;
                System.out.println("Value If True : " + hasilEnkrip[i]);
            } else if (hasilEnkrip[i] < mapPesanCr.length) {
                hasilEnkrip[i] = hasilEnkrip[i];
                System.out.println("Value If False : " + hasilEnkrip[i]);
            }

            System.out.println("\n==============================");
        }
    }

    public void hasilEnkripsi() {
        hasilEnkripsiStr = "";
       
        for (int i = 0; i < hasilEnkrip.length; i++) {
            for (int j = 0; j < mapHasilCr.length; j++) {
                if (j == hasilEnkrip[i]) {
                    System.out.println("Encryption Results " + hasilEnkripsiStr);
                    System.out.println("Map Results " + mapHasilCr[j]);
                    hasilEnkripsiStr += Character.toString(mapHasilCr[j]);
                }
            }
        }
    }

    public String getHasilEnkripsiStr() {
        System.out.println("Encryption Results : " + hasilEnkripsiStr.getBytes());
//        byte[] arraywe = hasilEnkripsiStr.getBytes();
        return hasilEnkripsiStr;
    }

    public void ekstrakDekripsi(String ChiperText, String keyword) {
        keyword = generateKey(ChiperText, keyword);
        hasilDekripsi = new int[ChiperText.length()];
//      
        for (int i = 0; i < ChiperText.length(); i++) {

            chPesan = ChiperText.charAt(i);
            chPass = keyword.charAt(i % keyword.length());
            for (int j = 0; j < mapHasilCr.length; j++) {
                if (chPesan == mapHasilCr[j]) {
                    nilaiPesan = j;
                    System.out.println("Message Value : " + chPesan + " : " + j);
                }
                if (chPass == mapPesanCr[j]) {
                    nilaiPass = j;
                    System.out.println("Value Pass : " + chPass + " : " + j);
                }
            }
            
            
            hasilDekripsi[i]= nilaiPesan - nilaiPass;
            System.out.println("Value : " + hasilDekripsi[i]);
            if (hasilDekripsi[i] < 0) {
                hasilDekripsi[i] = hasilDekripsi[i] + mapPesanCr.length;
                System.out.println("Value If True : " + hasilDekripsi[i]);
            } else if (hasilDekripsi[i] > 0) {
                hasilDekripsi[i] = hasilDekripsi[i];
                System.out.println("Value If False : " + hasilDekripsi[i]);
            }
            System.out.println("\n==============================");
        }
    }
    

    public void hasilDekripsi() {
        hasilDekripsiStr = "";
        int[] x = hasilDekripsi;
        
        for (int i = 0; i < hasilDekripsi.length; i++) {
            for (int j = 0; j < mapPesanCr.length; j++) {
                if (j == hasilDekripsi[i]) {
                    hasilDekripsiStr += Character.toString(mapPesanCr[j]);
                }
            }
        }
        
    }
    
    

    public String getHasilDekripsiStr() {
        System.out.println("Encryption Results : " + hasilDekripsiStr.getBytes());
        return hasilDekripsiStr;
    }

}
//[/code]
