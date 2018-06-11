/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lanhouseapp.frames;

import br.lanhouseapp.exceptions.GeneralException;
import br.lanhouseapp.jfa.fao.FileInterator;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author juanvmr
 */
public class UsuarioJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UsuarioInternalFrame
     */
    public UsuarioJInternalFrame() {
        LogFileIT = new FileInterator("actionLog.log", true);
        setFormatter();
        initComponents();
        random = new java.util.Random();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NomeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RuaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BairroTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CidadeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PesquisarJButton = new javax.swing.JButton();
        ExcluirJButton = new javax.swing.JButton();
        CadastrarJButton = new javax.swing.JButton();
        AtualizarJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CodigoClienteTextField = new javax.swing.JTextField();
        CodigoClienteTextField.setEnabled(false);
        CPFTextField = new javax.swing.JFormattedTextField(CPFMask);
        ErrorLabel = new javax.swing.JLabel();
        DataNascTextField = new javax.swing.JFormattedTextField(DataNascMask);
        CEPTextField = new javax.swing.JFormattedTextField(CEPMask);
        TelefoneTextField = new javax.swing.JFormattedTextField(TelefoneMask);

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Data Nasc.:");

        jLabel4.setText("Rua:");

        jLabel5.setText("CEP:");

        jLabel6.setText("Bairro:");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Telefone:");

        PesquisarJButton.setText("Pesquisar");

        ExcluirJButton.setText("Excluir");

        CadastrarJButton.setText("Cadastrar");

        AtualizarJButton.setText("Atualizar");

        jLabel9.setText("Codigo Cliente:");

        ErrorLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(NomeTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodigoClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CadastrarJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AtualizarJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExcluirJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PesquisarJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RuaTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataNascTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CEPTextField)
                                    .addComponent(CidadeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TelefoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(BairroTextField))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataNascTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RuaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(BairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(TelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CodigoClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PesquisarJButton)
                        .addComponent(ExcluirJButton)
                        .addComponent(CadastrarJButton)
                        .addComponent(AtualizarJButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void testeCampos() throws GeneralException{
        if(CPFTextField.getText().isEmpty()){
            throw new GeneralException("Campo CFP vazio");
        }
        else if(TelefoneTextField.getText().isEmpty()){
            throw new GeneralException("Campo Telefone vazio");
        }
        else if(NomeTextField.getText().isEmpty()){
            throw new GeneralException("Campo Nome vazio");
        }
    }
    
    public void setErrorLabel(String msg){
        this.ErrorLabel.setText(msg);
    }
    public void setCPFText(String msg){
        this.CPFTextField.setText(msg);
    }
    public void setTelefone(String msg){
        this.TelefoneTextField.setText(msg);
    }
    public void setNome(String msg){
        this.NomeTextField.setText(msg);
    }
    
    private void setFormatter(){
        try{
            CPFMask = new MaskFormatter("###.###.###-##");
            CEPMask = new MaskFormatter("#####-###");
            DataNascMask = new MaskFormatter("##/##/####");
            TelefoneMask = new MaskFormatter("#-####-####");
            
            CPFMask.setPlaceholderCharacter('_');
            CEPMask.setPlaceholderCharacter('_');
            DataNascMask.setPlaceholderCharacter('_');
            TelefoneMask.setPlaceholderCharacter('_');
        }
        catch(ParseException e){
            e.printStackTrace();
            LogFileIT.writeStackTrace(e);
        }
    }
    
    public void clearAllFields(){
        this.BairroTextField.setText("");
        this.CEPTextField.setText("");
        this.CPFTextField.setText("");
        this.CidadeTextField.setText("");
        this.DataNascTextField.setText("");
        this.NomeTextField.setText("");
        this.RuaTextField.setText("");
        this.TelefoneTextField.setText("");
    }
    
    public String getCodigoCliente(){
        return this.CodigoClienteTextField.getText();
    }
    
    public void generateCodigo(){
        this.CodigoClienteTextField.setText(random.ints(1000, 100000).toString());
    }
    
    private java.util.Random random;
    private MaskFormatter CPFMask;
    private MaskFormatter CEPMask;
    private MaskFormatter TelefoneMask;
    private MaskFormatter DataNascMask;
    private FileInterator LogFileIT;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarJButton;
    private javax.swing.JTextField BairroTextField;
    private javax.swing.JFormattedTextField CEPTextField;
    private javax.swing.JFormattedTextField CPFTextField;
    private javax.swing.JButton CadastrarJButton;
    private javax.swing.JTextField CidadeTextField;
    private javax.swing.JTextField CodigoClienteTextField;
    private javax.swing.JFormattedTextField DataNascTextField;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton ExcluirJButton;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JButton PesquisarJButton;
    private javax.swing.JTextField RuaTextField;
    private javax.swing.JFormattedTextField TelefoneTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}