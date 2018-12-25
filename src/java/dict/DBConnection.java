/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dict;
import java.sql.*;  
/**
 *
 * @author Michael
 */
public class DBConnection {
    
    public static Connection getConnection() throws Exception
    {  
        Connection conn;       
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/entries","root","root");  
        //here entries is database name, root is username and password  
       
        return conn;    
}
}
