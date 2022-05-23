/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appstegano;

import java.util.Vector;

/**
 *
 * @author Willy
 * @author GilangMF
 */
public class Vigene {

    private static final char[] alphnum = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
                                          'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
                                          'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 
                                          'Y', 'Z', '0', '1', '2', '3', '4', '5', 
                                          '6', '7', '8', '9', '@', '?', '#', '-', 
                                          '+', '!', '$', '%', '&', '*', '(', ')', 
                                          '_', '+', '=', '.', ',', ';', ':', '"', 
                                          '\'', '}', '{', '\\', '/', '^', '<', '>', 
                                          '[', ']', '^', '|', '`', '~'};
    private static final int dim = alphnum.length;
    private char[][] vgnrSquare = new char[alphnum.length][alphnum.length];
    private Vector<Character> alphnumv = new Vector();

    public Vigene() {
        init();
        for (int i = 0; i < dim; i++) {
            this.alphnumv.add(Character.valueOf(alphnum[i]));
        }
        print();
    }

    public void init() {
        for (int i = 0; i < dim; i++) {
            for (int j = i; j < dim; j++) {
                if (i == 0) {
                    this.vgnrSquare[i][j] = alphnum[j];
                } else {
                    this.vgnrSquare[i][(j - i)] = alphnum[j];
                }
            }
        }
        for (int i = 1; i < dim; i++) {
            int k = 0;
            for (int j = dim - i; j < dim; j++) {
                this.vgnrSquare[i][j] = alphnum[k];
                k++;
            }
        }
    }

    public String encrypt(String plaintext, String key) {
        if ((keyHasSpace(key)) || (key.length() == 0)) {
            System.out.println("\nKey cannot contain a space!\n");
            return null;
        }
        if (plaintext.length() == 0) {
            System.out.println("\nNothing to encrypt!\n");
            return null;
        }
        char[] ciphertext = new char[plaintext.length()];
        key = generateKey(plaintext, key);
        for (int i = 0; i < ciphertext.length; i++) {
            int row = this.alphnumv.indexOf(Character.valueOf(Character.toUpperCase(key.charAt(i))));
            int col = this.alphnumv.indexOf(Character.valueOf(Character.toUpperCase(plaintext.charAt(i))));
            if (plaintext.charAt(i) == ' ') {
                ciphertext[i] = ' ';
            } else if (plaintext.charAt(i) == '\n') {
                ciphertext[i] = '\n';
            } else if (plaintext.charAt(i) == '\t') {
                ciphertext[i] = '\t';
            } else {
                ciphertext[i] = this.vgnrSquare[row][col];
            }
        }
        System.out.println("\nPlaintext:  " + plaintext.getBytes());
        System.out.println("Key:        " + key.getBytes());
        return new String(ciphertext);
    }

    public String decrypt(String ciphertext, String key) {
        if ((keyHasSpace(key)) || (key.length() == 0)) {
            System.out.println("\nKey cannot contain a space!\n");
            return null;
        }
        if (ciphertext.length() == 0) {
            System.out.println("\nNothing to decrypt!\n");
            return null;
        }
        char[] plaintext = new char[ciphertext.length()];
        key = generateKey(ciphertext, key);
        for (int i = 0; i < plaintext.length; i++) {
            int row = this.alphnumv.indexOf(Character.valueOf(Character.toUpperCase(key.charAt(i))));
            int col = this.alphnumv.indexOf(Character.valueOf(Character.toUpperCase(ciphertext.charAt(i))));
            if (ciphertext.charAt(i) == ' ') {
                plaintext[i] = ' ';
            } else if (ciphertext.charAt(i) == '\n') {
                plaintext[i] = '\n';
            } else if (ciphertext.charAt(i) == '\t') {
                plaintext[i] = '\t';
            } else {
                int x = (col - row) % dim;
                if (x >= 0) {
                    plaintext[i] = ((Character) this.alphnumv.elementAt(x)).toString().charAt(0);
                } else {
                    plaintext[i] = ((Character) this.alphnumv.elementAt(dim + x)).toString().charAt(0);
                }
                plaintext[i] = Character.toLowerCase(plaintext[i]);
            }
        }
        System.out.println("\nCiphertext: " + ciphertext);
        System.out.println("Key:        " + key);
        return new String(plaintext);
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

    public void print() {
        System.out.println();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(this.vgnrSquare[i][j] + " ");
                if (j == dim - 1) {
                    System.out.println();
                }
            }
        }
    }
}
