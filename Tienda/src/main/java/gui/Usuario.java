package gui;

import cls.CUsuarios;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class Usuario extends javax.swing.JFrame {
    
    public Usuario() {
        initComponents();
        setSize(950, 320);
        this.setTitle("Clientes");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Logo Xodo.jpg"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        CUsuarios user = new CUsuarios();
        user.mostrarUsuarios(jtUsuarios);
        jtaDire.setLineWrap(true);
        jtaDire.setWrapStyleWord(true);
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCorreo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDire = new javax.swing.JTextArea();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 57, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel1.setText("Dirección:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Id:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 37, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("Nombre: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Correo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });
        jPanel2.add(jtfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 190, -1));
        jPanel2.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, -1));
        jPanel2.add(jtfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, -1));

        jtaDire.setColumns(20);
        jtaDire.setRows(5);
        jScrollPane2.setViewportView(jtaDire);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 190, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 323, 195));

        btnBorrar.setText("ELIMINAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 150, -1));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 320, -1));

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, -1));

        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtUsuarios.setMaximumSize(new java.awt.Dimension(500, 310));
        jtUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 550, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        CUsuarios user = new CUsuarios();
        user.eliminarUsuario(jtfId);
        user.mostrarUsuarios(jtUsuarios);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       CUsuarios user = new CUsuarios();
       user.insertarUsuario(jtfNombre, jtaDire, jtfCorreo);
       user.mostrarUsuarios(jtUsuarios);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       CUsuarios user = new CUsuarios();
       user.modificarUsuario(jtfId, jtfNombre, jtaDire, jtfCorreo);
       user.mostrarUsuarios(jtUsuarios);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jtUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuariosMouseClicked
       CUsuarios user = new CUsuarios();
       user.seleccionarUsuario(jtUsuarios, jtfId, jtfNombre, jtaDire, jtfCorreo);
       user.mostrarUsuarios(jtUsuarios);
    }//GEN-LAST:event_jtUsuariosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtUsuarios;
    private javax.swing.JTextArea jtaDire;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
