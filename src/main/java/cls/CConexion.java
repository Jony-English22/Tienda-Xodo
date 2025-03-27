
package cls;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class CConexion {
  
    Connection conectar = null;
    String url = "jdbc:sqlite:C:/Users/arima/Workspaces/project/tienda.db"; 
    
    public Connection establecerConexion() {
       try {
           Class.forName("org.sqlite.JDBC");
           conectar = DriverManager.getConnection(url);
           
           //JOptionPane.showMessageDialog(null, "Se conecto correctamente");
       } catch (Exception e) {
           //JOptionPane.showMessageDialog(null, "No se conecto correctamente, error:" + e.toString());
       }
       return conectar;
    }
    
    public void cerrarConexion() {
        try {
            if(conectar != null) {
                conectar.close();
                JOptionPane.showMessageDialog(null, "Se cerro la conexión correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se cerro correctamente, error:" + e.toString());
        }
    }
}
