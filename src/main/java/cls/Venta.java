    
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
    public Integer id;
    public String producto;
    public Integer cantidad;
    public Double precio;
    public Double importe;
                                                                                                    
    public Venta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
    
    public void mostrarVenta(JTable tablaVenta) {
        DefaultTableModel modelo = new DefaultTableModel();
        //JScrollPane scrollPane = new JScrollPane(tablaVenta);
        modelo.setColumnIdentifiers(new String[]{"Cant", "Producto", "P/Unit", "Precio"});
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
    
    public void agregarVenta() {
        
    }
    
    /*public void actualizarTabla(JTable tablaVenta) {
        DefaultTableModel modelo = new DefaultTableModel() ;
        modelo.setRowCount(0);
        
        CConexion cc = new CConexion();
        String sql =  "SELECT DC.cantidad, P.Nombre AS Producto, DC.precio_unitario AS Precio, (DC.precio_unitario * DC.Cantidad) AS Importe "
                + "FROM DetalleCompra DC JOIN Producto P ON DC.ID_fkProducto = P.ID_Producto";
        
        try(Connection conn = cc.establecerConexion(); 
                PreparedStatement st = conn.prepareStatement(sql); 
                ResultSet rs = st.executeQuery()) {
            
            while (rs.next()) {
                Object[] fila = new Object[4];
                fila[0] = rs.getString("Cantidad");
                fila[1] = rs.getDouble("Producto");
                fila[2] = rs.getInt("Precio");
                fila[3] = rs.getDouble("Importe");
                modelo.addRow(fila);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        tablaVenta.setModel(modelo);
    }
    
    public void agregarVentaABaseDeDatos(int cantidad, String producto, double precio) {
        CConexion cc = new CConexion();
        String sql = "INSERT INTO DetalleCompra (ID_fkProducto, Cantidad, precio_unitario) VALUES ((SELECT ID_Producto FROM Producto WHERE Nombre = ?), ?, ?)";

        try (Connection conn = cc.establecerConexion();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, producto);  // Buscar el ID del producto por su nombre
            pst.setInt(2, cantidad);
            pst.setDouble(3, precio);
            pst.executeUpdate();  // Ejecutar la consulta

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}
