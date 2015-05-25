/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazynek;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dawid
 */
public class connect {
    private Connection polaczenie;
    public Connection connect(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Polaczenie udane");
        }
     catch (ClassNotFoundException cnfe){
             System.out.println("Polaczenie nie udane");
             } 
     
     String url = "jdbc:mysql://dawid73.cal24.pl:3306/dawid73_swsim";
     
     try{
         polaczenie = (Connection) DriverManager.getConnection(url, "dawid73_swsim", "java4321");
         System.out.println("Polaczenie z baza");
     }
     catch(SQLException se){
         System.out.println("Brak bazy");
     }
     return polaczenie;
    }
    
}
