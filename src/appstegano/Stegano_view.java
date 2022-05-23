package appstegano;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Stegano_view
        extends JFrame {

    private String stat_name;
    private String stat_path;
    private String ext;
    private String stat_name2;
    private String stat_path2;
    private String ext2;
    private Steganography model = new Steganography();
    private VigenereChipper vc = new VigenereChipper();
    private String stat_name3;
    private String stat_path3;
    private String ext3;
    private String isi_file;
    private JButton btnImage;
    private JButton btnMessage;
    private JButton btnNew;
    private JButton btnMore;
    private JLabel image_input;
    private JLabel image_input2;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JFileChooser jFileChooser1;
    private JFileChooser jFileChooser2;
    private JFileChooser jFileChooser3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTabbedPane jTabbedPane1;
    private JTextArea jTextArea1;
    private JLabel label_asli;
    private JLabel label_decode;
    private JLabel label_decode_name;
    private JLabel label_hasil;
    private JTextArea txtHasilDecrypt;
    private JTextArea txtHasilEncrypt;
    private JTextField txtImageDecode;
    private JTextField txtImageName;
    private JTextField txtKey;
    private JTextField txtKeyDecode;
    private JTextField txtMessage;

    public Stegano_view() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
    }

    private void initComponents() {
        this.jFileChooser1 = new JFileChooser();
        this.jFileChooser2 = new JFileChooser();
        this.jFileChooser3 = new JFileChooser();
        this.jPanel1 = new JPanel();
        this.jTabbedPane1 = new JTabbedPane();
        this.jPanel3 = new JPanel();
        this.jPanel7 = new JPanel();
        this.jLabel9 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabel21= new JLabel();
        this.jLabel22= new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.txtImageName = new JTextField();
        this.txtMessage = new JTextField();
        this.txtKey = new JTextField();
        this.btnImage = new JButton();
        this.btnMessage = new JButton();
        this.jButton4 = new JButton();
        this.jButton2 = new JButton();
        this.btnMore = new JButton();
        this.jPanel8 = new JPanel();
        this.image_input = new JLabel();
        this.image_input2 = new JLabel();
        this.label_asli = new JLabel();
        this.label_hasil = new JLabel();
        this.jPanel4 = new JPanel();
        this.jPanel9 = new JPanel();
        this.jLabel12 = new JLabel();
        this.jLabel13 = new JLabel();
        this.txtImageDecode = new JTextField();
        this.txtKeyDecode = new JTextField();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        this.btnNew = new JButton();
        this.jPanel10 = new JPanel();
        this.label_decode = new JLabel();
        this.label_decode_name = new JLabel();
        this.jPanel11 = new JPanel();
        this.jLabel16 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.txtHasilEncrypt = new JTextArea();
        this.jLabel17 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.txtHasilDecrypt = new JTextArea();
        this.jButton3 = new JButton();
        this.jPanel5 = new JPanel();
        this.jPanel6 = new JPanel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jPanel12 = new JPanel();
        this.jScrollPane3 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jButton1 = new JButton();

        setDefaultCloseOperation(3);
        setTitle("StegoCrypt");

        this.jPanel3.setBackground(new Color(153, 204, 255));

        this.jLabel9.setText("Cover Image ");

        this.jLabel10.setText("File Message");

        this.jLabel11.setText("Steganography Key");

        this.txtImageName.setEditable(false);
        this.txtImageName.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Stegano_view.this.txtImageNameMouseClicked(evt);
            }
        });
        this.txtMessage.setEditable(false);

        this.btnImage.setText("Browse");
        this.btnImage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.btnImageActionPerformed(evt);
            }
        });
        this.btnMessage.setText("Browse");
        this.btnMessage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.btnMessageActionPerformed(evt);
            }
        });
        this.jButton4.setText("Embedding Image");
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.jButton4ActionPerformed(evt);
            }
        });
        this.jButton2.setText("Clear");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.jButton2ActionPerformed(evt);
            }
        });
        GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel9).addComponent(this.jLabel10).addComponent(this.jLabel11)).addGap(31, 31, 31).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.txtKey, -2, 179, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton4, -1, 155, 32767)).addComponent(this.txtMessage, -1, 344, 32767).addComponent(this.txtImageName, -1, 344, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.btnMessage, -1, 124, 32767).addComponent(this.btnImage, -1, 124, 32767).addComponent(this.jButton2, -1, 124, 32767)).addContainerGap()));

        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.jLabel9).addGap(18, 18, 18).addComponent(this.jLabel10)).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.txtImageName, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.txtMessage, -2, -1, -2).addComponent(this.btnMessage))).addComponent(this.btnImage)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 13, 32767).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel11).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.txtKey, -2, -1, -2).addComponent(this.jButton4).addComponent(this.jButton2))).addContainerGap()));

        this.jPanel8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Preview"));

        this.image_input.setBackground(new Color(204, 255, 255));
        this.image_input.setHorizontalAlignment(0);
        this.image_input.setText("Original Image");
        this.image_input.setToolTipText("Original Image");
        this.image_input.setBorder(BorderFactory.createEtchedBorder());

        this.image_input2.setHorizontalAlignment(0);
        this.image_input2.setText("Stegano Image");
        this.image_input2.setToolTipText("Stegano Image");
        this.image_input2.setBorder(BorderFactory.createEtchedBorder());

        this.label_asli.setHorizontalAlignment(0);

        this.label_hasil.setHorizontalAlignment(0);

        GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.label_asli, GroupLayout.Alignment.LEADING, -1, 287, 32767).addComponent(this.image_input, GroupLayout.Alignment.LEADING, -2, 282, -2)).addGap(18, 18, 18).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.label_hasil, -1, 287, 32767).addComponent(this.image_input2, -2, 282, -2)).addContainerGap()));

        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.image_input2, -2, 222, -2).addComponent(this.image_input, -2, 222, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.label_asli, -1, 18, 32767).addComponent(this.label_hasil)).addContainerGap()));

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel8, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jPanel7, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel7, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel8, -1, -1, 32767).addContainerGap()));

        this.jTabbedPane1.addTab("  Encode  ", this.jPanel3);

        this.jPanel4.setBackground(new Color(153, 204, 255));

        this.jLabel12.setText("Steganography Image");

        this.jLabel13.setText("Steganography Key");

        this.txtImageDecode.setEditable(false);

        this.jButton5.setText("Browse");
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton6.setText("Decoding Image");
        this.jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.jButton6ActionPerformed(evt);
            }
        });
        this.btnNew.setText("Clear");
        this.btnNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.btnNewActionPerformed(evt);
            }
        });
        GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
        this.jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addGap(33, 33, 33).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel12).addComponent(this.jLabel13)).addGap(26, 26, 26).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.txtKeyDecode, -2, 194, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton6, -1, -1, 32767)).addComponent(this.txtImageDecode, -2, 354, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.btnNew, -1, 88, 32767).addComponent(this.jButton5, -1, 88, 32767)).addContainerGap()));

        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.txtImageDecode, -2, -1, -2).addComponent(this.jButton5)).addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.jLabel12).addGap(18, 18, 18).addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel13).addComponent(this.txtKeyDecode, -2, -1, -2).addComponent(this.jButton6).addComponent(this.btnNew)))).addContainerGap(20, 32767)));

        this.jPanel10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Preview Image"));

        this.label_decode.setHorizontalAlignment(0);
        this.label_decode.setText("Image Object");

        this.label_decode_name.setHorizontalAlignment(0);

        GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
        this.jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.label_decode, -2, 278, -2).addComponent(this.label_decode_name, -1, 278, 32767));

        jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel10Layout.createSequentialGroup().addComponent(this.label_decode, -2, 242, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.label_decode_name, -1, 30, 32767)));

        this.jPanel11.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Message Content"));

        this.jLabel16.setText("Encryption Results :");

        this.txtHasilEncrypt.setColumns(20);
        this.txtHasilEncrypt.setRows(5);
        this.jScrollPane1.setViewportView(this.txtHasilEncrypt);

        this.jLabel17.setText("Decryption Results :");

        this.txtHasilDecrypt.setColumns(20);
        this.txtHasilDecrypt.setRows(5);
        this.jScrollPane2.setViewportView(this.txtHasilDecrypt);

        this.jButton3.setText("Save");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.jButton3ActionPerformed(evt);
            }
        });
        GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
        this.jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup().addContainerGap().addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jScrollPane2, GroupLayout.Alignment.LEADING, -1, 292, 32767).addComponent(this.jScrollPane1, GroupLayout.Alignment.LEADING, -1, 292, 32767).addComponent(this.jLabel16, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup().addComponent(this.jLabel17).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 165, 32767).addComponent(this.jButton3))).addContainerGap()));

        jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addComponent(this.jLabel16).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -2, 111, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel17).addComponent(this.jButton3)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -1, 106, 32767).addContainerGap()));

        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.jPanel10, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jPanel11, -1, -1, 32767)).addComponent(this.jPanel9, -1, -1, 32767)).addContainerGap()));

        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel9, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel10, -1, -1, 32767).addComponent(this.jPanel11, -1, -1, 32767)).addContainerGap()));

        this.jTabbedPane1.addTab("  Decode  ", this.jPanel4);

        this.jPanel5.setBackground(new Color(153, 204, 255));

        this.jPanel6.setBackground(new Color(153, 204, 255));

//        this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/image/Settings.png")));
        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2).addContainerGap(-1, 32767)));

        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel2)));

        this.jLabel3.setFont(new Font("Showcard Gothic", 1, 24));
        this.jLabel3.setText("StegoCrypt");
        
        this.jLabel5.setText("The StegoCrypt application is the applied science of cryptography and steganography in Information Security. In this application, the Vigenere Cipher Algorithm is modified into Hijaiyah Letters (Arabic Letters) in the message creation process. In addition, there is the application of the Least Significant Bit (LSB) and Grayscale Image methods to the output images, which are the media for hiding messages.");
        
        this.jLabel4.setText("This application was made by: ");
        this.jLabel20.setText("1. Khairunnisak Nur Isnaini");
        this.jLabel21.setText("2. Gilang Miftakhul Fahmi");
        this.jLabel22.setText("3. Didit Suhartono");
        
        

        this.jLabel6.setFont(new Font("Tahoma", 1, 12));
        this.jLabel6.setText("Software Version 1.1");


        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        this.jPanel5.add(this.btnMore);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel6, -2, -1, -2).addGap(18, 18, 18).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.btnMore).addComponent(this.jLabel4, -2, 273, -2).addComponent(this.jLabel20, -2, 300, -2).addComponent(this.jLabel21, -2, 305, -2).addComponent(this.jLabel22, -2, 310, -2)).addContainerGap(145, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap(487, 32767).addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel8).addComponent(this.jLabel7).addComponent(this.jLabel6)).addContainerGap()));

        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel6, -2, -1, -2)).addGroup(jPanel5Layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel20).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel21).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel22).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.btnMore))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 168, 32767).addComponent(this.jLabel6).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel7).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel8).addGap(50, 50, 50)));
        
        
                
        this.jTabbedPane1.addTab("  About  ", this.jPanel5);
        this.btnMore.setText("More Info");
        this.btnMore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.btnMoreActionPerformed(evt);
            }
        });
        this.jTextArea1.setColumns(20);
        this.jTextArea1.setRows(5);
        this.jScrollPane3.setViewportView(this.jTextArea1);

        GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
        this.jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane3, -1, 624, 32767).addContainerGap()));

        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane3, -1, 401, 32767).addContainerGap()));

        //this.jTabbedPane1.addTab("Help", this.jPanel12);

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane1));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane1, -1, 451, 32767));

        this.jPanel2.setLayout(new GridLayout(1, 4));

        this.jPanel2.add(this.jLabel1);

        this.jButton1.setText("Close");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Stegano_view.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.jPanel2, GroupLayout.Alignment.TRAILING, -1, 649, 32767)).addContainerGap()));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel2, -2, -1, -2)));

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void btnImageActionPerformed(ActionEvent evt) {
        this.jFileChooser1.setFileSelectionMode(2);
        this.jFileChooser1.setFileFilter(new Image_Filter());
        int returnVal = this.jFileChooser1.showOpenDialog(this.jPanel1);
        File directory = this.jFileChooser1.getSelectedFile();
        try {
            String image = directory.getPath();
            this.stat_name = directory.getName();
            this.stat_path = directory.getPath();
            this.ext = Image_Filter.getExtension(directory);
            this.stat_path = this.stat_path.substring(0, this.stat_path.length() - this.stat_name.length() - 1);
            this.stat_name = this.stat_name.substring(0, this.stat_name.length() - 4);
            this.image_input.setIcon(new ImageIcon(ImageIO.read(new File(image))));
            this.txtImageName.setText(this.stat_path + "\\" + this.stat_name + "." + this.ext);
            this.label_asli.setText(this.stat_name + "." + this.ext);
        } catch (Exception except) {
            JOptionPane.showMessageDialog(null, "The File cannot be opened!", "Error!", 1);
        }
    }

    private void btnMessageActionPerformed(ActionEvent evt) {
        this.jFileChooser2.setFileSelectionMode(2);

        int returnVal = this.jFileChooser2.showOpenDialog(this.jPanel1);
        File directory = this.jFileChooser2.getSelectedFile();

        System.out.println(directory);

        FileInputStream in = null;
        try {
            in = new FileInputStream(directory);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            this.isi_file = "";
            while ((line = reader.readLine()) != null) {
                this.isi_file = (this.isi_file + "\n" + line);
                in.close();
            }
        } catch (IOException x) {
        }
        System.out.println("isi :" + this.isi_file);
        try {
            String image = directory.getPath();
            this.stat_name2 = directory.getName();
            this.stat_path2 = directory.getPath();
            this.ext2 = Image_Filter.getExtension(directory);
            this.stat_path2 = this.stat_path2.substring(0, this.stat_path2.length() - this.stat_name2.length() - 1);
            this.stat_name2 = this.stat_name2.substring(0, this.stat_name2.length() - 4);

            this.txtMessage.setText(this.stat_path2 + "\\" + this.stat_name2 + "." + this.ext2);
        } catch (Exception except) {
            JOptionPane.showMessageDialog(null, "The File cannot be opened!", "Error!", 1);
        }
    }

    private void txtImageNameMouseClicked(MouseEvent evt) {
        this.btnImage.getChangeListeners();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        if (this.txtImageName.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Select the Image Object first", "Alert!", 1);
        } else if (this.txtMessage.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Select the Message Object first", "Alert!", 1);
        } else if (this.txtKey.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Key / Key to encrypt the message", "Alert!", 1);
        } else {
            String stegan = JOptionPane.showInputDialog(this.jPanel1, "Enter File Name", "File name", -1);
            if (stegan.trim().equals("")) {
                stegan = "hasil_encode";
            }
            String text, ekstrak = "";
            try {
      
                vc.ekstrakEnkripsi(this.isi_file, this.txtKey.getText().trim());
                vc.hasilEnkripsi();
                ekstrak = vc.getHasilEnkripsiStr();
//                text = this.vc.encrypt(this.isi_file, this.txtKey.getText().trim());
                System.out.println(this.stat_path + " 1 " + this.stat_name + " 2 " + this.ext + " 3 " + stegan + " 4 " + ekstrak);
                if (this.model.encode(this.stat_path, this.stat_name, this.ext, stegan, ekstrak)) {
                    JOptionPane.showMessageDialog(this.jPanel1, "The Image was encoded Successfully!", "Success!", 1);
                } else {
                    JOptionPane.showMessageDialog(this.jPanel1, "The Image could not be encoded!", "Error!", 1);
                }
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                JOptionPane.showMessageDialog(null, "Encrypt Process Error Occurred.. Only Letters and Numbers can be Encrypted." + aioobe);
            } catch (Exception ex) {
                System.out.println("An Encode Error Occurred. " + ex.toString());
            }
            try {
                this.image_input2.setIcon(new ImageIcon(ImageIO.read(new File(this.stat_path + "/" + stegan + ".png"))));
                this.label_hasil.setText(stegan + ".png");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this.jPanel1, "Image Failed to Save", "Erorr!", 0);
            }
        }
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        this.jFileChooser3.setFileSelectionMode(2);
        this.jFileChooser3.setFileFilter(new Image_Filter());
        int returnVal = this.jFileChooser3.showOpenDialog(this.jPanel1);
        File directory = this.jFileChooser3.getSelectedFile();
        try {
            String image = directory.getPath();
            this.stat_name3 = directory.getName();
            this.stat_path3 = directory.getPath();
            this.ext3 = Image_Filter.getExtension(directory);
            this.stat_path3 = this.stat_path3.substring(0, this.stat_path3.length() - this.stat_name3.length() - 1);
            this.stat_name3 = this.stat_name3.substring(0, this.stat_name3.length() - 4);
            this.label_decode.setIcon(new ImageIcon(ImageIO.read(new File(image))));
            this.txtImageDecode.setText(this.stat_path3 + "\\" + this.stat_name3 + "." + this.ext3);
            this.label_decode_name.setText(this.stat_name3 + "." + this.ext3);
        } catch (Exception except) {
            JOptionPane.showMessageDialog(null, "The File cannot be opened!", "Error!", 1);
        }
    }
// Decode
    private void jButton6ActionPerformed(ActionEvent evt) {
        if (this.txtImageDecode.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Select the Image Object first", "Alert!", 1);
        } else if (this.txtKeyDecode.getText().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Input Key to Read message", "Alert!", 1);
        } else {
            String ekstrak = "";
            byte[] ek = ekstrak.getBytes(StandardCharsets.UTF_8);
            String Eks = new String(ek, StandardCharsets.UTF_8);
            
            String message = this.model.decode(this.stat_path3, this.stat_name3);
            byte[] x = message.getBytes();
            String y = new String(x, StandardCharsets.UTF_8);
            System.out.println(this.stat_path3 + ", " + this.stat_name3);
            if (y != "") {
                JOptionPane.showMessageDialog(this.jPanel1, "The Image was decoded Successfully!", "Success!", 1);

                this.txtHasilEncrypt.setText(y);

                vc.ekstrakDekripsi(y, this.txtKeyDecode.getText().toString().trim());
                vc.hasilDekripsi();
//                String hasil = this.vc.decrypt(message, this.txtKeyDecode.getText().toString().trim());
                Eks = vc.getHasilDekripsiStr();
                this.txtHasilDecrypt.setText(Eks);
                System.out.println("Result : " + Eks);
            } else {
                JOptionPane.showMessageDialog(this.jPanel1, "The Image could not be decoded!", "Error!", 1);
            }
        }
    }

    private void btnNewActionPerformed(ActionEvent evt) {
        this.txtHasilDecrypt.setText("");
        this.txtHasilEncrypt.setText("");
        this.txtKeyDecode.setText("");
        this.txtKey.setText("");
        this.txtImageDecode.setText("");
        this.label_decode.setIcon(null);
        this.label_asli.setText("");
        this.label_hasil.setText("");
        this.label_decode_name.setText("");
        this.image_input.setIcon(null);
        this.image_input2.setIcon(null);
        this.txtImageName.setText("");
        this.txtMessage.setText("");
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.txtHasilDecrypt.setText("");
        this.txtHasilEncrypt.setText("");
        this.txtKeyDecode.setText("");
        this.txtKey.setText("");
        this.txtImageDecode.setText("");
        this.label_decode.setIcon(null);
        this.label_asli.setText("");
        this.label_hasil.setText("");
        this.label_decode_name.setText("");
        this.image_input.setIcon(null);
        this.image_input2.setIcon(null);
        this.txtImageName.setText("");
        this.txtMessage.setText("");
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        String stegan = JOptionPane.showInputDialog(this.jPanel1, "Enter the Steganography Result File Name", "File name", -1);
        if (stegan.trim().equals("")) {
            stegan = "result_encode";
        }
        String path = this.stat_path2 + "\\" + stegan + "." + this.ext2;
        File sampleFile = new File(path);
        try {
            String text = this.txtHasilDecrypt.getText();
            FileWriter fileWriter = new FileWriter(sampleFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text, 0, text.length());
            bufferedWriter.newLine();
            bufferedWriter.close();
            JOptionPane.showMessageDialog(this.jPanel1, "Save Process Successful. \n Files Saved in: " + path, "Alert!", 1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        Vigene str = new Vigene(); 
        
        try {
//            UIManager.LookAndFeelInfo info = null;
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Stegano_view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Stegano_view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Stegano_view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Stegano_view.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                //splashscreen.load sp = new splashscreen.load();
                //sp.setVisible(true);
                
                
                new Stegano_view().setVisible(true);
            }
        });
    }

    private void btnMoreActionPerformed(ActionEvent evt) {
        new about().setVisible(true);
    }
}
