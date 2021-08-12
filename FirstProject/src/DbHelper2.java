/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbHelper2 {
     private String userName= "postgres";
    private String password= "admin";
    private String dburl= "jdbc:postgresql://localhost:5432/login";
    
    public Connection getConnection()throws SQLException {
        return DriverManager.getConnection(dburl, userName, password);
}

    public void showErrorMessage( SQLException exception){
   System.out.println("Error: " + exception.getMessage());
}
    
}
