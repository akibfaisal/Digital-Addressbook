package code.addressbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Faisal
 */
public class DbUtil {
    
    Connection connection=null;
    
    /*private final String DB_URL = "jdbc:mysql://localhost/addressbook";
    private final String USER = "root";
    private final String PASS = "369ko852";*/
    
    public Connection getConnection (){
         try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:addressbook.db"); //C:\\Users\\Faisal\\Downloads\\Documents\\
         } catch(ClassNotFoundException | SQLException e){
             System.out.println("driver loading problem" + e.getMessage());
         }
         
         return connection;
    }
    
    public void closeConnection(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

