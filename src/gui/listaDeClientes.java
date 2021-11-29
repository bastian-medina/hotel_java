/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import hotel.Habitacion;
import hotel.Huesped;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registro.conexion;

/**
 *
 * @author nicolaita
 */
public class listaDeClientes extends javax.swing.JFrame {

    String[][] matriz = new String[100][4];
    DefaultTableModel modelo;

    /**
     * Creates new form listaDeClientes
     */
    public listaDeClientes() {
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

        butListarClientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        butMinimizarLista = new javax.swing.JButton();
        butXLista = new javax.swing.JButton();
        butCancelarLista = new javax.swing.JButton();
        listaClientesBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butListarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/listarCliente1.png"))); // NOI18N
        butListarClientes.setBorder(null);
        butListarClientes.setBorderPainted(false);
        butListarClientes.setContentAreaFilled(false);
        butListarClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/listarCliente2.png"))); // NOI18N
        butListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butListarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(butListarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Lista de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        tablaClientes.setBackground(new java.awt.Color(255, 255, 255));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Rut", "Habitación", "Cantidad de personas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tablaClientes.setEnabled(false);
        jScrollPane1.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 730, 360));

        butMinimizarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/minimizar2.png"))); // NOI18N
        butMinimizarLista.setBorder(null);
        butMinimizarLista.setBorderPainted(false);
        butMinimizarLista.setContentAreaFilled(false);
        butMinimizarLista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/minimizar1.png"))); // NOI18N
        butMinimizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMinimizarListaActionPerformed(evt);
            }
        });
        getContentPane().add(butMinimizarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 20, 40));

        butXLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/xx1.png"))); // NOI18N
        butXLista.setBorder(null);
        butXLista.setBorderPainted(false);
        butXLista.setContentAreaFilled(false);
        butXLista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/xx2.png"))); // NOI18N
        butXLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butXListaActionPerformed(evt);
            }
        });
        getContentPane().add(butXLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, 20));

        butCancelarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/cancelarRegistro.png"))); // NOI18N
        butCancelarLista.setBorder(null);
        butCancelarLista.setBorderPainted(false);
        butCancelarLista.setContentAreaFilled(false);
        butCancelarLista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/cancelarRegistro2.png"))); // NOI18N
        butCancelarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarListaActionPerformed(evt);
            }
        });
        getContentPane().add(butCancelarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 670, -1, -1));

        listaClientesBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/buscarClientes.png"))); // NOI18N
        listaClientesBG.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                listaClientesBGMouseDragged(evt);
            }
        });
        listaClientesBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaClientesBGMousePressed(evt);
            }
        });
        getContentPane().add(listaClientesBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boton que minimiza la ventana
     *
     * @param evt
     */
    private void butMinimizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMinimizarListaActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_butMinimizarListaActionPerformed
    /**
     * Boton de "X" que cierra la ventana y abre el menú
     *
     * @param evt
     */
    private void butXListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butXListaActionPerformed
        this.dispose();
        menuSys menu1 = new menuSys();
        menu1.setVisible(true);
    }//GEN-LAST:event_butXListaActionPerformed
    /**
     * Boton "cancelar" que cierra la ventana y abre el menú
     *
     * @param evt
     */
    private void butCancelarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarListaActionPerformed
        this.dispose();
        menuSys menu1 = new menuSys();
        menu1.setVisible(true);
    }//GEN-LAST:event_butCancelarListaActionPerformed
    /**
     * Coordenadas de mouse y ventana para poder arrastrarla
     */
    int xx, xy;

    /**
     * Toma las coordenadas del mouse presionado
     *
     * @param evt
     */
    private void listaClientesBGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClientesBGMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_listaClientesBGMousePressed
    /**
     * Se toman las cordenadas del mouse dragged esto genera que la ventana se
     * pueda mover con el mouse
     *
     * @param evt
     */
    private void listaClientesBGMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClientesBGMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_listaClientesBGMouseDragged
    /**
     * Toma a todos los clientes del ArrayList e imprime en una tabla su nombre,
     * rut, habitacion y acompañantes respectivamente
     *
     * @param evt
     */
    private void butListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butListarClientesActionPerformed
        // listar hacia una tabla gràfica
        try {
            String[] titulos = {"Nombre", "Rut", "Habitacion", "Cantidad de personas"};
            int fila = 0;
            conexion con = new conexion();
            ArrayList<Huesped> lista = con.listar();
            for (Huesped huesped : lista) {
                matriz[fila][0] = huesped.getNombre();
                matriz[fila][1] = huesped.getRut();
                matriz[fila][2] = huesped.getApellido(); //e conexion se ve que devuelve la habitacion en que habita
                matriz[fila][3] = String.valueOf(huesped.getAcompannantes());
                fila++;
            }
            modelo = new DefaultTableModel(matriz, titulos);
            tablaClientes.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_butListarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(listaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaDeClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelarLista;
    private javax.swing.JButton butListarClientes;
    private javax.swing.JButton butMinimizarLista;
    private javax.swing.JButton butXLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listaClientesBG;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
