/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lanhouseapp.frames;

import br.lanhouseapp.jfa.fao.FileInterator;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginJFrame extends javax.swing.JFrame {


    public LoginJFrame() {
        initComponents();
        
        //Inicializar Banco de Dados
        try{
            Runtime.getRuntime().exec("cmd /c rundb.bat");
        }
        catch(java.io.IOException e){
            e.printStackTrace();
            System.out.println("Banco não inicializado");
        }
        
        fileIT = new FileInterator("lastUser.txt", true);
        if(!(lastUser = fileIT.fileRead()).isEmpty()){
            CodigoTextField.setText(lastUser);
        }
//        fileIT = null;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CodigoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        OKJButton = new javax.swing.JButton();
        SenhaField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("Código:");

        jLabel3.setText("Senha:");

        OKJButton.setText("OK");
        OKJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SenhaField)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKJButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CodigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKJButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKJButtonActionPerformed
        if(new String(SenhaField.getPassword()).compareTo("82380")==0){
           //envia a data de acesso e usuário para o arquivo
            Calendar calendar = Calendar.getInstance();
            Date data = calendar.getTime(); 
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            fileIT = new FileInterator("temp.txt", false);
            fileIT.fileWrite("Usuário: "+CodigoTextField.getText());
            fileIT.fileWrite(" Acesso em: "+sdf.format(data));
            
            
            fileIT = new FileInterator("lastUser.txt", false);
            fileIT.fileWrite(CodigoTextField.getText());
            new MainJFrame().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_OKJButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }
    
    FileInterator fileIT;
    String lastUser;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoTextField;
    private javax.swing.JButton OKJButton;
    private javax.swing.JPasswordField SenhaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
