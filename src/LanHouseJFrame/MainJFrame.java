/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanHouseJFrame;

import Limbo.LoginJInternalFrame;
import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import javax.swing.JOptionPane;

/**
 *
 * @author juanvmr
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainJFrame() {
        initComponents();
        
        admin = new AdminJInternalFrame();
        admin.setVisible(false);
        this.add(admin);
        
        usuario = new UsuarioJInternalFrame();
        usuario.setVisible(false);
        this.add(usuario);
        
        novavenda = new NovaVendaJInternalFrame();
        novavenda.setVisible(false);
        this.add(novavenda);
        
        maquinas = new MaquinasJInternalFrame();
        maquinas.setVisible(false);
        this.add(maquinas);
        
        initialOpening();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        AdminMenu = new javax.swing.JMenu();
        GerenciarAdminJMenuItem = new javax.swing.JMenuItem();
        UsuarioMenu = new javax.swing.JMenu();
        GerenciarUsuarioJMenuItem = new javax.swing.JMenuItem();
        MaquinasMenu = new javax.swing.JMenu();
        GerenciarMaquinasJMenuItem = new javax.swing.JMenuItem();
        VendasMenu = new javax.swing.JMenu();
        NovaVendaJMenuItem = new javax.swing.JMenuItem();
        RelatorioVendaJMenuItem = new javax.swing.JMenuItem();
        SobreMenu = new javax.swing.JMenu();
        SobreJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminMenu.setText("Admin");

        GerenciarAdminJMenuItem.setText("Gerenciar");
        GerenciarAdminJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarAdminJMenuItemActionPerformed(evt);
            }
        });
        AdminMenu.add(GerenciarAdminJMenuItem);

        jMenuBar1.add(AdminMenu);

        UsuarioMenu.setText("Usuário");

        GerenciarUsuarioJMenuItem.setText("Gerenciar");
        GerenciarUsuarioJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarUsuarioJMenuItemActionPerformed(evt);
            }
        });
        UsuarioMenu.add(GerenciarUsuarioJMenuItem);

        jMenuBar1.add(UsuarioMenu);

        MaquinasMenu.setText("Máquinas");

        GerenciarMaquinasJMenuItem.setText("Gerenciar");
        MaquinasMenu.add(GerenciarMaquinasJMenuItem);

        jMenuBar1.add(MaquinasMenu);

        VendasMenu.setText("Vendas");

        NovaVendaJMenuItem.setText("Nova venda");
        NovaVendaJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovaVendaJMenuItemActionPerformed(evt);
            }
        });
        VendasMenu.add(NovaVendaJMenuItem);

        RelatorioVendaJMenuItem.setText("Relatório");
        VendasMenu.add(RelatorioVendaJMenuItem);

        jMenuBar1.add(VendasMenu);

        SobreMenu.setText("Sobre");

        SobreJMenuItem.setText("Sobre nós");
        SobreMenu.add(SobreJMenuItem);

        jMenuBar1.add(SobreMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initialOpening(){
        this.AdminMenu.setEnabled(false);
        this.MaquinasMenu.setEnabled(false);
        this.UsuarioMenu.setEnabled(false);
        this.VendasMenu.setEnabled(false);
        
        this.setVisible(true);
        this.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {

            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {

            }

            @Override
            public void componentHidden(ComponentEvent e) {
                AdminMenu.setEnabled(true);
                MaquinasMenu.setEnabled(true);
                UsuarioMenu.setEnabled(true);
                VendasMenu.setEnabled(true);
            }

        });
        
    }
            
    private void GerenciarUsuarioJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarUsuarioJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GerenciarUsuarioJMenuItemActionPerformed

    private void NovaVendaJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovaVendaJMenuItemActionPerformed
        if(javax.swing.JOptionPane.showConfirmDialog(null, "É cliente?", "Atenção!", JOptionPane.YES_NO_OPTION) == 1){
            novavenda.setCodigoClienteState(true);
        }
        else{
            if(javax.swing.JOptionPane.showConfirmDialog(null, "Deseja cadastrar-se?", "Atenção!", JOptionPane.YES_NO_OPTION) == 1){
                usuario.clearAllFields();
                usuario.setVisible(true);
                novavenda.setCodigoCliente(usuario.getCodigoCliente());
            }
            novavenda.setCodigoClienteState(false);
        }
    }//GEN-LAST:event_NovaVendaJMenuItemActionPerformed

    private void GerenciarAdminJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarAdminJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GerenciarAdminJMenuItemActionPerformed

    
    NovaVendaJInternalFrame novavenda;
    MaquinasJInternalFrame maquinas;
    UsuarioJInternalFrame usuario;
    AdminJInternalFrame admin;
    ActionEvent evt;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdminMenu;
    private javax.swing.JMenuItem GerenciarAdminJMenuItem;
    private javax.swing.JMenuItem GerenciarMaquinasJMenuItem;
    private javax.swing.JMenuItem GerenciarUsuarioJMenuItem;
    private javax.swing.JMenu MaquinasMenu;
    private javax.swing.JMenuItem NovaVendaJMenuItem;
    private javax.swing.JMenuItem RelatorioVendaJMenuItem;
    private javax.swing.JMenuItem SobreJMenuItem;
    private javax.swing.JMenu SobreMenu;
    private javax.swing.JMenu UsuarioMenu;
    private javax.swing.JMenu VendasMenu;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
