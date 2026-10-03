package grafica;
import logica.LstUsuarios;
import persistencia.Archivo;

public class FrmPrincipal extends javax.swing.JFrame {
    
    public static LstUsuarios coleccion;
    
    public FrmPrincipal() {
        initComponents();
        /* coleccion = new LstUsuarios(); /* <------ Sin aplicar archivos (anterior) */
        
        // Aplicación de archivo (comentar anterior y descomentar abajo): ✔
        
        coleccion = Archivo.getInstancia().usuariosRegistrados();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAltaUsuario = new javax.swing.JMenuItem();
        btnHistorial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnModificarContrasenia = new javax.swing.JMenuItem();
        btnIniciarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador Contraseñas");
        setMaximumSize(new java.awt.Dimension(2100000000, 2100000000));
        setPreferredSize(new java.awt.Dimension(1000, 500));

        javax.swing.GroupLayout dskPanelLayout = new javax.swing.GroupLayout(dskPanel);
        dskPanel.setLayout(dskPanelLayout);
        dskPanelLayout.setHorizontalGroup(
            dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        dskPanelLayout.setVerticalGroup(
            dskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        jMenu1.setText("Administrador");

        btnAltaUsuario.setText("Alta Usuario");
        btnAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnAltaUsuario);

        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        jMenu1.add(btnHistorial);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuario");

        btnModificarContrasenia.setText("Modificar contraseña");
        btnModificarContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarContraseniaActionPerformed(evt);
            }
        });
        jMenu2.add(btnModificarContrasenia);

        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jMenu2.add(btnIniciarSesion);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaUsuarioActionPerformed
        // Abre la ventana encargada de registrar usuarios (solo falta terminar el archivo.java)
        FrmAltaUsuario altaUsuario = new FrmAltaUsuario();

        dskPanel.add(altaUsuario);
        altaUsuario.setVisible(true);
    }//GEN-LAST:event_btnAltaUsuarioActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // Abre la ventana encargada de ver el historial de inicios de sesión (solo falta terminar el archivo.java)
        FrmHistorial historial = new FrmHistorial();

        dskPanel.add(historial);
        historial.setVisible(true);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnModificarContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarContraseniaActionPerformed
        // Abre la ventana encargada de la modificación de contraseñas (solo falta terminar el archivo.java)
        FrmModificarContrasenia modificarContrasenia = new FrmModificarContrasenia();

        dskPanel.add(modificarContrasenia);
        modificarContrasenia.setVisible(true);
    }//GEN-LAST:event_btnModificarContraseniaActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // Abre la ventana encargada del inicio de sesión (solo falta terminar el archivo.java)
        FrmIniciarSesion iniciarSesion = new FrmIniciarSesion();

        dskPanel.add(iniciarSesion);
        iniciarSesion.setVisible(true);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAltaUsuario;
    private javax.swing.JMenuItem btnHistorial;
    private javax.swing.JMenuItem btnIniciarSesion;
    private javax.swing.JMenuItem btnModificarContrasenia;
    private javax.swing.JDesktopPane dskPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}