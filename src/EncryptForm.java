
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desmond
 */
public class EncryptForm extends javax.swing.JFrame {
    JFileChooser fileChooser;
    String completeText;
    ArrayList space_indices;
    ArrayList newline_indices;
    String[] key;
    Random random;
    String filePath, fileName, encrypted_text;
    
    /**
     * Creates new form EncryptForm
     */
    public EncryptForm() {
        initComponents();
        fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        space_indices = new ArrayList();
        newline_indices=new ArrayList();
        completeText="";
        random = new Random();
        encrypted_text = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputText = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        keyText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        encryptedText = new javax.swing.JTextArea();
        filepathText = new javax.swing.JTextField();
        filepathButton = new javax.swing.JButton();
        encryptKey = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        filepathText_save = new javax.swing.JTextField();
        filepathButton_Save = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        cancelButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENCRYPTION FORM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Choose the file to encrypt :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Text File Contains :");

        inputText.setColumns(20);
        inputText.setRows(5);
        jScrollPane1.setViewportView(inputText);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Decrytion Key :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Encrypted Text :");

        encryptedText.setColumns(20);
        encryptedText.setRows(5);
        jScrollPane2.setViewportView(encryptedText);

        filepathButton.setText("Choose");
        filepathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filepathButtonActionPerformed(evt);
            }
        });

        encryptKey.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        encryptKey.setText("Encrypt Text");
        encryptKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptKeyActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Choose where to save the encrypted file :");

        filepathButton_Save.setText("Choose");
        filepathButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filepathButton_SaveActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backButton.setText("Decrypt File");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(keyText)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(filepathText, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filepathButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(encryptKey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(filepathText_save, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filepathButton_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filepathText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filepathButton))
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptKey, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filepathText_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filepathButton_Save)
                    .addComponent(saveButton))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void filepathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filepathButtonActionPerformed
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();
            filepathText.setText(filePath);
            inputText.setText("");
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null) {
                    inputText.append(sCurrentLine+"\n");
                    completeText += (sCurrentLine+"\n");
                }
            } catch (IOException e) {
                    e.printStackTrace();
            }
        }
        //completeText += "\b";
    }//GEN-LAST:event_filepathButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            new DecryptForm().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void encryptKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptKeyActionPerformed
        System.out.println(completeText);
        char[] completeText_char = completeText.toCharArray();
        for(int i=0; i<completeText.length(); i++){
            System.out.println(i+" : "+completeText_char[i]+" : "+(int)completeText_char[i]);
        }
        for(int i=0; i<completeText.length(); i++){
            if((int)completeText_char[i]==10){  //new line character = 10
                completeText_char[i]='x';   
                newline_indices.add(i);
            }
            if((int)completeText_char[i]==32){  //space character = 32
                completeText_char[i]='y';
                space_indices.add(i);
            }
        }
        System.out.println("===newline===");
        completeText = String.valueOf(completeText_char);
        System.out.println(completeText);
        for(int i=0; i<newline_indices.size(); i++){
            System.out.println(newline_indices.get(i));
        }
        System.out.println("===space===");
        for(int i=0; i<space_indices.size(); i++){
            System.out.println(space_indices.get(i));
        }
        
        String alphabet[]=generateAlphabet();
        String key[]=Arrays.copyOfRange(alphabet,0,11);
        String original_alphabet[]= new String[52];
        int temp_count=0;
        for(int i=65; i<91; i++){
            original_alphabet[temp_count++]=Integer.toString(i);
        }
        for(int i=97; i<123; i++){
            original_alphabet[temp_count++]=Integer.toString(i);
        }
        
        System.out.println("=====original alphabet====");
        for(int i=0; i<52; i++){
            //System.out.println(original_alphabet[i]);
            System.out.println(i+":"+(char)Integer.parseInt(original_alphabet[i]));
        }
        System.out.println("====alphabet====");
        for(int i=0; i<52; i++){
            System.out.println(i+":"+(char)Integer.parseInt(alphabet[i]));
        }
        System.out.println("====key====");
        for(int i=0; i<10; i++){
            System.out.print((char)Integer.parseInt(key[i])+" ");
        }
        System.out.println(" ");
        System.out.println("==Text==");
        for(int i=0; i<completeText_char.length; i++){
            System.out.print(completeText_char[i]+" ");
        }
        System.out.println(" ");
        
        String substitution_arr[]=new String[completeText.length()];
        for(int i=0; i<completeText.length(); i++){
            int index=getIndex(original_alphabet, Character.toString(completeText.charAt(i)));
            //System.out.println(index);
            if(index != -1){
                substitution_arr[i]=alphabet[index];
            }else{
                substitution_arr[i]=Character.toString(completeText.charAt(i));
            }
           
        }
        System.out.println("==Encrypted Text==");
        for(int i=0; i<substitution_arr.length; i++){
            System.out.println(substitution_arr[i]);
            //char encrypted_char=(char)(Integer.parseInt(substitution_arr[i]));
            //System.out.println(encrypted_char);
            //System.out.println((char)Integer.parseInt(encrypted_text[i]));
        }
        
        //permutation encryption process
        int arr_lenght = substitution_arr.length;
        int mod = arr_lenght%4;
        int division_count;
        int additional_key_count = 0;
        if(mod == 0){
            division_count = arr_lenght/4;
        }else{
            division_count = (arr_lenght/4)+1;
            additional_key_count = (division_count*4)-(arr_lenght);
        }
        System.out.println("array length : "+arr_lenght);
        System.out.println("division count : "+division_count);
        System.out.println("additional key count : "+additional_key_count);
        
        String permutation_arr[][] = new String[division_count][4];
        temp_count=0;
        int temp_div_count=0;
        while(temp_count < arr_lenght){
            for(int i=0; i<4; i++){
                System.out.println("division : "+temp_div_count+" i : "+i);
                System.out.println("count : "+temp_count);
                permutation_arr[temp_div_count][i]=substitution_arr[temp_count++];
                System.out.println(permutation_arr[temp_div_count][i]);
                if(temp_count == arr_lenght){
                    break;
                }
            }
            temp_div_count++;
        }
        //adding extra elements to the array
        for(int i=(4-additional_key_count); i<4; i++){
            permutation_arr[division_count-1][i]=Integer.toString(120);
        }
        
        //print permutation array
        for(int i=0; i<division_count; i++){
            for(int j=0; j<4; j++){
                System.out.print(permutation_arr[i][j]+" ");
            }
            System.out.println("");
        }
        
        //generating randon 4-digit number
        String permutation_key[] = new String[4];
        temp_count = 0;
        while(temp_count < 4){
            int temp = random.nextInt(4);
            if(permutation_key[temp] == null){
                permutation_key[temp]=Integer.toString(temp_count);
                temp_count++;
            }
        }
        System.out.println("-- permutation key --");
        for(int i=0; i<4; i++){
            System.out.print(permutation_key[i]+" ");
        }
        System.out.println(" ");
        
        //permutation process
        String permutated_arr[][] = new String[division_count][4];
        for(int i=0; i<division_count; i++){
            System.out.println("division: "+i);
            for(int j=0; j<4; j++){
                int index=Integer.parseInt(permutation_key[j]);
                System.out.println("j: "+j+"   index: "+index);
                permutated_arr[i][index]=permutation_arr[i][j];
            }
        }
        
        //print permutated array
        for(int i=0; i<division_count; i++){
            for(int j=0; j<4; j++){
                System.out.print(Integer.parseInt(permutated_arr[i][j])+" ");
            }
            System.out.println("");
        }
        
        //print permutated array (in characters)
        for(int i=0; i<division_count; i++){
            for(int j=0; j<4; j++){
                System.out.print((char)(Integer.parseInt(permutated_arr[i][j]))+" ");
            }
            System.out.println("");
        }
        
        //get permutated array
        for(int i=0; i<division_count; i++){
            for(int j=0; j<4; j++){
                String temp = Character.toString((char)(Integer.parseInt(permutated_arr[i][j])));
                encrypted_text+=temp;
            }
        }
        System.out.println(encrypted_text);
        encryptedText.setText(encrypted_text);
        
        //generating key
        String sub_key_string = "";
        String per_key_string="";
        for(int i=0; i<10; i++){
            sub_key_string += Character.toString((char)Integer.parseInt(key[i]));
        }
        for(int i=0; i<4; i++){
            per_key_string += permutation_key[i];
        }
        int space_count=space_indices.size();
        int newline_count=newline_indices.size();
        
        String main_key=sub_key_string+per_key_string+Integer.toString(additional_key_count);
        for(int i=0; i<newline_indices.size(); i++){
            String temp1, temp2;
            if(random.nextInt(2)==0){
                temp1 = Character.toString((char)(random.nextInt(26)+65));
                temp2 = Character.toString((char)(random.nextInt(26)+97));
            }else{
                temp1 = Character.toString((char)(random.nextInt(26)+97));
                temp2 = Character.toString((char)(random.nextInt(26)+65));
            }
            main_key += temp1+temp2+newline_indices.get(i);
        }
        main_key += "@";
        for(int i=0; i<space_indices.size(); i++){
            String temp1, temp2;
            if(random.nextInt(2)==0){
                temp1 = Character.toString((char)(random.nextInt(26)+65));
                temp2 = Character.toString((char)(random.nextInt(26)+97));
            }else{
                temp1 = Character.toString((char)(random.nextInt(26)+97));
                temp2 = Character.toString((char)(random.nextInt(26)+65));
            }
            main_key += temp1+temp2+space_indices.get(i);
        }
        
        System.out.println("--key--");
        System.out.println(main_key);
        keyText.setText(main_key);
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_encryptKeyActionPerformed

    private void filepathButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filepathButton_SaveActionPerformed
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();
            filepathText_save.setText(filePath);
            fileName = filePath+"\\Encrypted_File.txt";
            System.out.println(fileName);
            
        }
    }//GEN-LAST:event_filepathButton_SaveActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            String content = encrypted_text;
            bw.write(content);
            // no need to close it.
            //bw.close();
            System.out.println("Done");
        } catch (IOException e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EncryptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton encryptKey;
    private javax.swing.JTextArea encryptedText;
    private javax.swing.JButton filepathButton;
    private javax.swing.JButton filepathButton_Save;
    private javax.swing.JTextField filepathText;
    private javax.swing.JTextField filepathText_save;
    private javax.swing.JTextArea inputText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField keyText;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
    public String[] generateAlphabet(){
        String[] alphabet=new String[52];
        key=new String[10];
        int count = 0;
        while(count < 10){
            boolean b = true;
            String type = "normal";
            int  value=random.nextInt(26);
            int type_chooser = random.nextInt(2);
            if(type_chooser == 1){
                type = "block";
            }
            //System.out.println(type);
            //System.out.println("value: "+ value);
            for(int j=0; j<10; j++){
                if(key[j]!=null){
                    if(type.equals("normal")){
                        if(Integer.parseInt(key[j])==(value+97)){
                            b=false;
                            //System.out.println(b);
                        }
                    }else{
                        if(Integer.parseInt(key[j])==(value+65)){
                            b=false;
                            //System.out.println(b);
                        }
                    }
                }
            }
            if(b == true){
                if(type.equals("normal")){
                    key[count++]=Integer.toString(value+97);
                }else{
                    key[count++]=Integer.toString(value+65);
                }
            }
        }
        for(int i=0; i<10; i++){
            alphabet[i]=key[i];
        }
        int fill_count=10;
        int char_count=65;
        while(char_count<91){
            if(!isInKey(char_count)){
                //System.out.println("new: "+char_count);
                alphabet[fill_count++]=Integer.toString(char_count);                
            }
            char_count++;
        }
        char_count=97;
        while(char_count<123){
            if(!isInKey(char_count)){
                //System.out.println("new: "+char_count);
                alphabet[fill_count++]=Integer.toString(char_count);                
            }
            char_count++;
        }
       
//        System.out.println("====alphabet====");
//        for(int i=0; i<52; i++){
//            System.out.println((char)Integer.parseInt(alphabet[i]));
//        }
        
//        System.out.println("====key characters====");
//        for(int i=0; i<10; i++){
//            System.out.println((char)Integer.parseInt(key[i]));
//        }
       
        return alphabet;
    }
    
    public boolean isInKey(int value){
        boolean b=false;
        for(int i=0; i<10; i++){
            if(key[i].equals(Integer.toString(value))){
                b=true;
            }
        }
        return b;
    }
    
    public int getIndex(String[] arr, String key){
        int index = -1;
        int char_value = (int)key.charAt(0);
        
        for(int i=0; i<arr.length; i++){
           if(Integer.toString(char_value).equals(arr[i])){
               index=i;
               break;
           }      
        }
        return index;
    }
}
