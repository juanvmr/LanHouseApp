/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lanhouseapp.listeners;
import br.lanhouseapp.exceptions.GeneralException;
import br.lanhouseapp.frames.UsuarioJInternalFrame;
import br.lanhouseapp.jfa.fao.FileInterator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author juanvmr
 */
public class UsuarioListener implements ActionListener{
    UsuarioJInternalFrame usuario;
    private String errorMessage;
    private FileInterator LogFileIT;
    
    public UsuarioListener(UsuarioJInternalFrame usuario){
        this.usuario = usuario;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case ".usuario.cadastrarButton": {
                try{
                    LogFileIT.fileWrite(e.getActionCommand());
                    usuario.testeCampos();
                    usuario.setVisible(false);
                    usuario.generateCodigo();
                }
                catch(GeneralException k){
                    LogFileIT.writeStackTrace(k);
                    errorMessage = k.getMessage();
                    usuario.setErrorLabel(errorMessage);
                    if(errorMessage.contains("CPF")){
                        usuario.setCPFText("*");
                    }
                    else if(errorMessage.contains("Telefone")){
                        usuario.setTelefone("*");
                    }
                    else if(errorMessage.contains("Nome")){
                        usuario.setNome("*");
                    }
                }
            }
        }
    }
}
