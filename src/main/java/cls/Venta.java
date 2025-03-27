    
package cls;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Venta {
    int id;
    String descripcion;
    int cantidad;
    double precio;
    double importe;

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getImporte() {
        return importe;
    }
    
    public void mostrarVenta(JTable tablaVenta) {
        DefaultTableModel modelo = new DefaultTableModel();
        //JScrollPane scrollPane = new JScrollPane(tablaVenta);
        modelo.setColumnIdentifiers(new String[]{"Cant", "Descripción", "P/Unit", "Precio"});
        tablaVenta.setModel(modelo);
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
       
        int columna1 = 80;
        int columna2 = 347;
        int columna3 = 80;
        int columna4 = 80;
        
        TableColumn column1 = tablaVenta.getColumnModel().getColumn(0);
        TableColumn column2 = tablaVenta.getColumnModel().getColumn(1);
        TableColumn column3 = tablaVenta.getColumnModel().getColumn(2);
        TableColumn column4 = tablaVenta.getColumnModel().getColumn(3);
        
      
        
        column1.setMaxWidth(columna1);
        column1.setMinWidth(columna1);
        column1.setPreferredWidth(columna1);
        
        column2.setMaxWidth(columna2);
        column2.setMinWidth(columna2);
        column2.setPreferredWidth(columna2);

        column3.setMaxWidth(columna3);
        column3.setMinWidth(columna3);
        column3.setPreferredWidth(columna3);
        
        column4.setMaxWidth(columna4);
        column4.setMinWidth(columna4);
        column4.setPreferredWidth(columna4);
    }
    
    public List<String> extraerProductos() {
        CConexion conexion = new CConexion();
        String sql = "SELECT Nombre, Precio FROM Producto";
        Statement st;
        
        List<String> productos = new ArrayList<>();  
        
        try {
            st = conexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                 String nombre = rs.getString(1); 
                 String precio = rs.getString(2);
                 
                 String producto = nombre + " - " + precio;
                 
                productos.add(producto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se cargaron los productos : " + e);
        }
        
        return productos;
    }
    
    
}
