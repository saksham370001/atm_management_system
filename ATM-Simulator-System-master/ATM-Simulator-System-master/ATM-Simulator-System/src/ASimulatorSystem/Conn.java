package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String password="connect";
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem1","root","Getwh@tuw@nt1");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){
            System.out.println(e);
        }  
    }  
}  
