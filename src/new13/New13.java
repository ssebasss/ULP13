/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new13;

import javax.swing.JOptionPane;
import org.mariadb.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

/**
 *
 * @author Seba
 */
public class New13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        try{          
            // cargar driver
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("cargó MI CIELAAAAA");
            
            
            //conectar BD
           Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3308/tp13_ulp", "root", "");
                     
            
            
        }catch(ClassNotFoundException cnf){
            JOptionPane.showMessageDialog(null,"Error al cargar driver");
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al conectar BD");
        }
        
        
        
        
        
        
        
    }
    
}
