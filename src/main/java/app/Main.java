package app;

import gui.TiendaXODO;
import gui.Usuario;
import gui.Login;
import gui.Producto;

public class Main {
     public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TiendaXODO().setVisible(true);
                //new Usuario().setVisible(true);
                //new Login().setVisible(true);
                new Producto().setVisible(true);
                
                //PRUEBA DE COMMIT PRUEBA
            }
        }); 
    }
    
}
