/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lanhouseapp.listeners;
import br.lanhouseapp.exceptions.GeneralException;
import br.lanhouseapp.frames.MainJFrame;
import br.lanhouseapp.frames.UsuarioJInternalFrame;
import br.lanhouseapp.jfa.fao.FileInterator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author juanvmr
 */
public class MainFrameListener implements ActionListener{
    MainJFrame mainFrame;
    private String errorMessage;
    private FileInterator LogFileIT;
    
    public MainFrameListener(MainJFrame mainFrame){
        this.mainFrame = mainFrame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case ".main.gerenciarUsuarioButton":{

            }
            case ".main.gerenciarAdminButton":{
                
            }
            case ".main.gerenciarMaquinasButton":{
                
            }
            case ".main.novaVendaButton":{
                
            }
            case ".main.relatorioVendasButton":{
                
            }
            case ".main.sobreButton":{
                
            }
        }
    }
}
