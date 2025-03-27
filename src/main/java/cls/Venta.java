    
package cls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Venta {
    
    private Integer   id;
    private CUsuarios cliente;
    private String    fecha;
    private Double    total;
    
    public Venta() {
        
    }
    public Venta (Integer pId, CUsuarios pCliente, String pFecha, Double pTotal) {
        this.id      = pId;
        this.cliente = pCliente;
        this.fecha   = pFecha;
        this.total   = pTotal;
    }

    public Integer getId() {
        return id;
    }

    public CUsuarios getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setId(Integer pId) {
        this.id = pId;
    }

    public void setCliente(CUsuarios pCliente) {
        this.cliente = pCliente;
    }

    public void setFecha(String pFecha) {
        this.fecha = pFecha;
    }

    public void setTotal(Double pTotal) {
        this.total = pTotal;
    }
                                                                                                    
    
    public void mostrarVenta(JTable tablaVenta) {
        DefaultTableModel modelo = (DefaultTableModel) tablaVenta.getModel();
        modelo.setColumnIdentifiers(new String[]{"Cant", "Producto", "P/Unit", "Precio"});
        tablaVenta.setModel(modelo);
        
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
