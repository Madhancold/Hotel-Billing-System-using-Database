/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GOWTHAM & VIGNESH
 */
public class db {
           Connection con=null;

    public Connection logindb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mmkdb","root","root");
            System.out.println("success");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    } 
    public Connection getcon()
    {
        return con;
    }
     public Connection attdb(){
        Connection con1=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mmkdb","root","root");
            System.out.println("success");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con1;
    } 
    
}
