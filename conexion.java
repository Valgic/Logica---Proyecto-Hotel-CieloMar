/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author GRUPO GESTION Y CALIDAD DE SOFTWARE 2020 
 */
public class conexion {

    public static void getstatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String db="basereserva";
    public String url="jdbc:mysql://127.0.0.1/" +db;
    public String user="root";
    public String pass="";

    
    
    public Connection conectar(){
        
        Connection link=null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
        return link;
    }
    
   
    
    
}
