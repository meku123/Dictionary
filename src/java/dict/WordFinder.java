/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dict;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael
 */
public class WordFinder {
    
    public word findWord(String name)
    {
        try{  
            Connection conn=DBConnection.getConnection();

            Statement stmt=conn.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from entries where lower(word)=lower('"+name+"')");
            List<Definition> defn=new ArrayList<>();
            if(rs!=null)
            {
            while(rs.next())
            {
                Definition d=new Definition(rs.getString(2),rs.getString(3));
                defn.add(d);
            }
            
            word w=new word(name,defn);
            return w;
            }
                      
        }   
       catch(Exception e){ System.out.println(e);}  
       return null;
    }     
}
