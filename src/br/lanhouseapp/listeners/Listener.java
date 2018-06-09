/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lanhouseapp.listeners;
import br.lanhouseapp.exceptions.GeneralException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author juanvmr
 */
public class Listener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case ".usuario.cadastrarButton": {
                        try{
                        testeCampos();
                        this.setVisible(false);
                        generateCodigo();
                    }
                    catch(GeneralException e){
                        e.printStackTrace();
                        ExcFileIT.writeStackTrace(e);
                        errorMessage = e.getMessage();
                        super.ErrorLabel.setText(errorMessage);
                        if(errorMessage.contains("CPF")){
                            CPFTextField.setText("*");
                        }
                        else if(errorMessage.contains("Telefone")){
                            TelefoneTextField.setText("*");
                        }
                        else if(errorMessage.contains("Nome")){
                            NomeTextField.setText("*");
                        }
                    }
            }
        }
    }
}
