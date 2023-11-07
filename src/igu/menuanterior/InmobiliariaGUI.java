/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu.menuanterior;

import entidades.EstadoSesion;
import entidades.Usuario;
import javax.swing.JOptionPane;
import persistencia.ControlAcceso;

/**
 *
 * @author Raven
 */
public class InmobiliariaGUI extends javax.swing.JFrame {

    private ControlAcceso controlacceso;
    private int intentos = 0;

    /**
     * Creates new form InmobiliariaGUI
     */
    public InmobiliariaGUI() {
        initComponents();
        menusinicio();
      //  controlacceso = new ControlAcceso();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPlogueo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTpwd = new javax.swing.JTextField();
        jTBvalidar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jPacceso = new javax.swing.JPanel();
        jLbarraNombre = new javax.swing.JLabel();
        jLbarranivel = new javax.swing.JLabel();
        jBCerrarS = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMLogin = new javax.swing.JMenu();
        jMpropiedades = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMpropietarios = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMalquileres = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMlistados = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 153, 255));
        jDesktopPane1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jDesktopPane1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("UTILIZEN ESTE PANEL HASTA QUE PUEDA HACER FUNCIONAR EL OTRO (MENUTEST)");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese su Email");

        jTemail.setText("sgfesta@gmail.com");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Ingrese su Password");

        jTpwd.setText("loquito");

        jTBvalidar.setText("Validar");
        jTBvalidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBvalidarActionPerformed(evt);
            }
        });

        jLabel4.setText("Panel de Logueo!");

        javax.swing.GroupLayout jPlogueoLayout = new javax.swing.GroupLayout(jPlogueo);
        jPlogueo.setLayout(jPlogueoLayout);
        jPlogueoLayout.setHorizontalGroup(
            jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlogueoLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel4)
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPlogueoLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTBvalidar)
                        .addGroup(jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTemail)
                            .addComponent(jTpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jPlogueoLayout.setVerticalGroup(
            jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlogueoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPlogueoLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addGroup(jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPlogueoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jTpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addComponent(jTBvalidar)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        jLbarraNombre.setToolTipText("");

        jLbarranivel.setToolTipText(" ");

        jBCerrarS.setText("Cerrar Session");
        jBCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaccesoLayout = new javax.swing.GroupLayout(jPacceso);
        jPacceso.setLayout(jPaccesoLayout);
        jPaccesoLayout.setHorizontalGroup(
            jPaccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbarraNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(642, 642, 642)
                .addComponent(jLbarranivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65)
                .addComponent(jBCerrarS)
                .addGap(36, 36, 36))
        );
        jPaccesoLayout.setVerticalGroup(
            jPaccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaccesoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPaccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCerrarS)
                    .addComponent(jLbarranivel)
                    .addComponent(jLbarraNombre)))
        );

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPlogueo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPacceso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPacceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jPlogueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPlogueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jPacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));

        jMLogin.setBackground(new java.awt.Color(51, 51, 51));
        jMLogin.setForeground(new java.awt.Color(204, 0, 0));
        jMLogin.setText("LOGIN");
        jMLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMLogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuBar1.add(jMLogin);

        jMpropiedades.setBackground(new java.awt.Color(51, 51, 51));
        jMpropiedades.setForeground(new java.awt.Color(204, 0, 0));
        jMpropiedades.setText("PROPIEDADES");
        jMpropiedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMpropiedades.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(51, 204, 255));
        jMenuItem1.setText("INGRESO DE PROPIEDADES");
        jMpropiedades.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(51, 204, 255));
        jMenuItem2.setText("LISTADOS DE PROPIEDADES DISP");
        jMpropiedades.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(51, 204, 255));
        jMenuItem3.setText("MODIFICACIONES");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMpropiedades.add(jMenuItem3);

        jMenuBar1.add(jMpropiedades);

        jMpropietarios.setBackground(new java.awt.Color(51, 51, 51));
        jMpropietarios.setForeground(new java.awt.Color(204, 0, 0));
        jMpropietarios.setText("PROPIETARIOS");
        jMpropietarios.setActionCommand("PROPIEDADES");
        jMpropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMpropietarios.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem4.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(51, 204, 255));
        jMenuItem4.setText("NUEVO PROPIETARIO");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMpropietarios.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(51, 204, 255));
        jMenuItem5.setText("BUSQUEDA DE PROPETARIOS");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMpropietarios.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(51, 204, 255));
        jMenuItem6.setText("MODIFICACIONES");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMpropietarios.add(jMenuItem6);

        jMenuBar1.add(jMpropietarios);

        jMalquileres.setBackground(new java.awt.Color(51, 51, 51));
        jMalquileres.setForeground(new java.awt.Color(204, 0, 0));
        jMalquileres.setText("ALQUILERES");
        jMalquileres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMalquileres.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenuItem8.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(102, 204, 255));
        jMenuItem8.setText("BUSQUEDA DE PROPIEDADES");
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMalquileres.add(jMenuItem8);

        jMenuItem9.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(102, 204, 255));
        jMenuItem9.setText("ALQUILAR");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMalquileres.add(jMenuItem9);

        jMenuItem10.setBackground(new java.awt.Color(102, 102, 102));
        jMenuItem10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(51, 204, 255));
        jMenuItem10.setText("LISTADO DE CONTRATOS");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMalquileres.add(jMenuItem10);

        jMenuBar1.add(jMalquileres);

        jMlistados.setBackground(new java.awt.Color(51, 51, 51));
        jMlistados.setForeground(new java.awt.Color(204, 0, 0));
        jMlistados.setText("LISTADOS");
        jMlistados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMlistados.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenu6.setText("INQUILINOS");

        jMenuItem11.setText("NUEVO INQUILINO");
        jMenu6.add(jMenuItem11);

        jMenuItem14.setText("LISTADO DE INQUILINOS");
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("MODIFICACION");
        jMenu6.add(jMenuItem15);

        jMlistados.add(jMenu6);

        jMenu7.setText("GARANTES");

        jMenuItem16.setText("NUEVO GARANTES");
        jMenu7.add(jMenuItem16);

        jMenuItem17.setText("LISTADO DE GARANTES");
        jMenu7.add(jMenuItem17);

        jMenuItem18.setText("MODIFICACION");
        jMenu7.add(jMenuItem18);

        jMlistados.add(jMenu7);

        jMenu8.setText("INSPECTORES");

        jMenuItem19.setText("NUEVO INSPECTOR");
        jMenu8.add(jMenuItem19);

        jMenuItem20.setText("LISTADO DE INSPECTORES");
        jMenu8.add(jMenuItem20);

        jMenuItem21.setText("MODIFICACION");
        jMenu8.add(jMenuItem21);

        jMlistados.add(jMenu8);

        jMenuBar1.add(jMlistados);

        jMsalir.setBackground(new java.awt.Color(51, 51, 51));
        jMsalir.setForeground(new java.awt.Color(204, 0, 0));
        jMsalir.setText("SALIR");
        jMsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMsalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(jMsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTBvalidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBvalidarActionPerformed

        if (intentos < 3) { // Comprobar si se han realizado menos de 3 intentos
            String email = jTemail.getText();
            String pwd = jTpwd.getText();
            Usuario usuarioActual = controlacceso.iniciarSesion(email, pwd);

            if (usuarioActual != null) {
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + usuarioActual.getNombre() + " !!");
                jLbarraNombre.setText("Usuario : " + usuarioActual.getNombre());
                jLbarranivel.setText("NivelAcceso : " + usuarioActual.getNivelAcceso());
                activarMenuNivel(usuarioActual.getNivelAcceso());
                // Establecer el usuario actual en el EstadoSesion
                EstadoSesion.setUsuarioActual(usuarioActual);
                //Cierro panel de logueo
                jPlogueo.setVisible(false);

            } else {
                intentos++;
                JOptionPane.showMessageDialog(null, "Vuelva a INTENTAR!, intentos permitidos" + (3 - intentos));
                // Incrementar el contador de intentos
                if (intentos == 3) {
                    // Si se han realizado 3 intentos fallidos
                    jTBvalidar.setEnabled(false);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se han alcanzado los 3 intentos. Bloqueando el acceso.");

        }


    }//GEN-LAST:event_jTBvalidarActionPerformed

    private void jBCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSActionPerformed
        System.out.println("cierro session");
        EstadoSesion.cerrarSesion();
        menusinicio();
        jLbarraNombre.setText("");
        jLbarranivel.setText("");

    }//GEN-LAST:event_jBCerrarSActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InmobiliariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InmobiliariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InmobiliariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InmobiliariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InmobiliariaGUI().setVisible(true);
//            }
//        });
//    }

    //Metodos de Control
    private void menusinicio() {
        jMLogin.setEnabled(true);
        jMpropiedades.setVisible(false);
        jMpropietarios.setVisible(false);
        jMalquileres.setVisible(false);
        jMlistados.setVisible(false);
        jBCerrarS.setVisible(false);
        jMsalir.setVisible(true);
        jPlogueo.setVisible(true);

    }

    private void activarMenuNivel(int nivelAcceso) {
        // Habilitar o deshabilitar elementos de menú según el nivel de acceso
        switch (nivelAcceso) {
            case 10: // Nivel de acceso 10 (por ejemplo, administrador)
                jMLogin.setEnabled(true);
                jMpropiedades.setVisible(true);
                jMpropietarios.setVisible(true);
                jMalquileres.setVisible(true);
                jMlistados.setVisible(true);
                jBCerrarS.setVisible(true);
                jMsalir.setVisible(true);
                break;
            case 20: // Nivel de acceso 20 (por ejemplo, usuarioActual contable)
                jMLogin.setEnabled(true);
                jMpropiedades.setVisible(false);
                jMpropietarios.setVisible(true);
                jMalquileres.setVisible(false);
                jMlistados.setVisible(true);
                jBCerrarS.setVisible(true);
                jMsalir.setVisible(true);
                break;
            case 30: // Nivel de acceso 30 (por ejemplo, usuarioActual vendedor)
                jMLogin.setEnabled(true);
                jMpropiedades.setVisible(false);
                jMpropietarios.setVisible(false);
                jMalquileres.setVisible(true);
                jMlistados.setVisible(true);
                jBCerrarS.setVisible(true);
                jMsalir.setVisible(true);
                break;
            case 40: // Nivel de acceso 40 (por ejemplo, usuarioActual novato)
                jMLogin.setEnabled(true);
                jMpropiedades.setVisible(false);
                jMpropietarios.setVisible(false);
                jMalquileres.setVisible(false);
                jMlistados.setVisible(true);
                jBCerrarS.setVisible(true);
                jMsalir.setVisible(true);

                break;
            default: // Otros niveles de acceso o valor no válido
                jMLogin.setEnabled(true);
                jMpropiedades.setVisible(false);
                jMpropietarios.setVisible(false);
                jMalquileres.setVisible(false);
                jMlistados.setVisible(false);
                jBCerrarS.setVisible(true);
                jMsalir.setVisible(true);
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCerrarS;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbarraNombre;
    private javax.swing.JLabel jLbarranivel;
    private javax.swing.JMenu jMLogin;
    private javax.swing.JMenu jMalquileres;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMlistados;
    private javax.swing.JMenu jMpropiedades;
    private javax.swing.JMenu jMpropietarios;
    private javax.swing.JMenu jMsalir;
    private javax.swing.JPanel jPacceso;
    private javax.swing.JPanel jPlogueo;
    private javax.swing.JToggleButton jTBvalidar;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTpwd;
    // End of variables declaration//GEN-END:variables
}