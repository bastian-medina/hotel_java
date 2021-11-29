/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import hotel.Trabajador;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import registro.conexion;

/**
 *
 * @author nicolaita
 */
public class iniSys extends javax.swing.JFrame {

    /**
     * Creates new form iniSys
     */
    public iniSys() {
        initComponents();
        /**
         * Coloca la pestaña en el centro de la pantalla al iniciar
         */
        this.setLocationRelativeTo(null);
        /**
         * Icono de aplicación
         */
        setIconImage(new ImageIcon(getClass().getResource("/Logo/faroLogo.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        butOlvido = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();
        butInicio = new javax.swing.JButton();
        butMinimizar = new javax.swing.JButton();
        butExit1 = new javax.swing.JButton();
        txtPassUsu = new javax.swing.JPasswordField();
        txtRut = new javax.swing.JTextField();
        IniPane = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butOlvido.setBackground(new java.awt.Color(255, 204, 0));
        butOlvido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/olvido1.png"))); // NOI18N
        butOlvido.setBorder(null);
        butOlvido.setBorderPainted(false);
        butOlvido.setContentAreaFilled(false);
        butOlvido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/olvido2.png"))); // NOI18N
        butOlvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOlvidoActionPerformed(evt);
            }
        });
        getContentPane().add(butOlvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 170, 30));

        butCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/CANCELPRINCIPAL_1.png"))); // NOI18N
        butCancelar.setBorder(null);
        butCancelar.setBorderPainted(false);
        butCancelar.setContentAreaFilled(false);
        butCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/CANCELPRINCIPAL_2.png"))); // NOI18N
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(butCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, 30));

        butInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/INICIO_SESION_1.png"))); // NOI18N
        butInicio.setBorder(null);
        butInicio.setBorderPainted(false);
        butInicio.setContentAreaFilled(false);
        butInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/INICIO_SESION_2.png"))); // NOI18N
        butInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInicioActionPerformed(evt);
            }
        });
        getContentPane().add(butInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 30));

        butMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/minimizar2.png"))); // NOI18N
        butMinimizar.setBorder(null);
        butMinimizar.setBorderPainted(false);
        butMinimizar.setContentAreaFilled(false);
        butMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/minimizar1.png"))); // NOI18N
        butMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(butMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 10, 30, 20));

        butExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/xx1.png"))); // NOI18N
        butExit1.setBorder(null);
        butExit1.setBorderPainted(false);
        butExit1.setContentAreaFilled(false);
        butExit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        butExit1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/xx2.png"))); // NOI18N
        butExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExit1ActionPerformed(evt);
            }
        });
        getContentPane().add(butExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        txtPassUsu.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPassUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 280, 30));

        txtRut.setBackground(new java.awt.Color(255, 255, 255));
        txtRut.setToolTipText("");
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 280, -1));

        IniPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/inicio_sesion_frame.png"))); // NOI18N
        IniPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                IniPaneMouseDragged(evt);
            }
        });
        IniPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IniPaneMousePressed(evt);
            }
        });
        getContentPane().add(IniPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botón de iniciar sesión, si no hay campos rellenados o queda uno
     * sinrellenar, muestra mensaje "rellena todos los campos". Si los datos no
     * coinciden muestra el mensaje "Ingreso fallido, Contraseña o rut
     * incorrectos.", por ultimo si estan todos los campos completos, abre menu
     * y cierra este frame
     *
     * @param evt
     */
    private void butInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInicioActionPerformed

        conexion con = new conexion();

        try {
            if (txtRut.getText().length() >= 1 && txtRut.getText().length() <= 10) {
                try {
                    ArrayList<Trabajador> contraLista = con.validarContrasenna(txtRut.getText(), txtPassUsu.getText());
                    ArrayList<Trabajador> rutLista = con.validarRut(txtRut.getText());

                    if (rutLista.get(0).getRut().equals(txtRut.getText()) && contraLista.get(0).getContrasenna().equals(txtPassUsu.getText())) {
                        menuSys sysl = new menuSys();
                        sysl.setVisible(true);
                        this.dispose();

                    }
                } catch (Exception ex) {
                    //Mensaje de error si falta un campo por rellenar o si usuario o contraseña es incorreco
                    JOptionPane.showMessageDialog(this, "Ingreso fallido, Contraseña o rut incorrectos.");
                }

            } else {
                //Mensaje de error si no hay ningún campo rellenado
                JOptionPane.showMessageDialog(this, "Ingreso fallido, Contraseña o rut incorrectos.");

            }

        } catch (Exception ex) {
            Logger.getLogger(iniSys.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_butInicioActionPerformed
    /**
     * Botón en forma de "x" que cierra el programa (exit(0))
     *
     * @param evt
     */
    private void butExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_butExit1ActionPerformed
    /**
     * Botón cancelar que cierra el programa (exit(0))
     *
     * @param evt
     */
    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_butCancelarActionPerformed
    /**
     * Coordenadas de mouse y ventana para poder arrastrarla
     */
    int xx, xy;

    /**
     * Toma las coordenadas del mouse presionado
     *
     * @param evt
     */
    private void IniPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniPaneMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_IniPaneMousePressed
    /**
     * Se toman las cordenadas del mouse dragged esto genera que la ventana se
     * pueda mover con el mouse
     *
     * @param evt
     */
    private void IniPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniPaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_IniPaneMouseDragged
    /**
     * Botón de minimizar
     *
     * @param evt
     */
    private void butMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_butMinimizarActionPerformed
    /**
     * Botón de olvido de contraseña, abre el JDialog "iniOlvido"
     *
     * @param evt
     */
    private void butOlvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOlvidoActionPerformed
        iniOlvido hijo = new iniOlvido(this, true);
        hijo.setVisible(true);
    }//GEN-LAST:event_butOlvidoActionPerformed

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
            java.util.logging.Logger.getLogger(iniSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniSys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IniPane;
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butExit1;
    private javax.swing.JButton butInicio;
    private javax.swing.JButton butMinimizar;
    private javax.swing.JButton butOlvido;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txtPassUsu;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}