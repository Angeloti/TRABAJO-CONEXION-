/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import java.sql.*;
/**
 *
 * @author User
 */
public class ConexionBD {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
      try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/sitemas","localhost","");
            System.out.println("se hizo la conecion exitosa");
    }catch(Exception e){
          System.out.println(e.getMessage());        
}return cn;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("no soportado");
    }
    
    
}
