/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arima
 */
public class CUsuarios {
    
        public void mostrarUsuarios(JTable tablaUsuarios) {
            CConexion conexion = new CConexion();
            DefaultTableModel modelo = new DefaultTableModel();

            String sql = "";

            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("DIRECCIÓN");
            modelo.addColumn("CORREO");

            tablaUsuarios.setModel(modelo);

            sql = "SELECT * FROM Cliente";

            String[] datos = new String[4];
            Statement st;
            try {
                st = conexion.establecerConexion().createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);

                    modelo.addRow(datos);
                }

               tablaUsuarios.setModel(modelo);
               
               tablaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);
               tablaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(110);
               tablaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(200);
               tablaUsuarios.getColumnModel().getColumn(3).setPreferredWidth(140);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al mortar, " + e.toString());
            }
        }
        
        public void insertarUsuario(JTextField name, JTextArea direccion, JTextField mail) {
            CConexion conexion = new CConexion();
            String consulta = "INSERT INTO Cliente(Nombre,Direccion, Correo_Electronico) VALUES(?,?,?)";
            
            try {
                PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
                ps.setString(1, name.getText());
                ps.setString(2, direccion.getText());
                ps.setString(3, mail.getText());
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Se guardo correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se guardo correctamente" + e.toString());
            }
        }
        
        public void seleccionarUsuario(JTable tablausuario, JTextField id, JTextField name, JTextArea direccion, JTextField mail) {
           try {
              int fila = tablausuario.getSelectedRow();
              
              if (fila >= 0) {
                  id.setText(tablausuario.getValueAt(fila, 0).toString());
                  name.setText(tablausuario.getValueAt(fila, 1).toString());
                  direccion.setText(tablausuario.getValueAt(fila, 2).toString());
                  mail.setText(tablausuario.getValueAt(fila, 3).toString());
              } else {
                  JOptionPane.showMessageDialog(null,  "No se puedo seleccionar");
              }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,  "Error de seleccion: " + e.toString());
                
            } 
        }

        public void modificarUsuario(JTextField id, JTextField name, JTextArea direccion, JTextField mail) {
            CConexion conexion = new CConexion();
            String consulta = "UPDATE Cliente SET Nombre = ?,Direccion=?, Correo_Electronico=? WHERE ID_Cliente =?;";
            
            try {
                PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
                ps.setString(1, name.getText());
                ps.setString(2, direccion.getText());
                ps.setString(3, mail.getText());
                ps.setString(4, id.getText());
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Se modifico correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se modifico correctamente" + e.toString());
            }
        }
        
         public void eliminarUsuario(JTextField id) {
            CConexion conexion = new CConexion();
            String consulta = " DELETE FROM Cliente  WHERE ID_Cliente =?;";
            
            try {
                PreparedStatement ps = conexion.establecerConexion().prepareStatement(consulta);
                     ps.setString(1, id.getText());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Se modifico correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se modifico correctamente" + e.toString());
            }
        }
        
        
}
