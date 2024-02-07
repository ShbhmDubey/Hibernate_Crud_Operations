/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.sql.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author aman
 */
public class Data2 {
    
    
    public static void main(String[] ss){
        try{
        Class c=Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubhamdb","root","root");
       // System.out.println(con);
       Statement s=con.createStatement();
       for(int i=0;i<4;i++){
       long k=s.executeUpdate("insert into teacher values('raghav',12,'dsa',18)");
       }
//       if(k>0){
//           System.out.println("Query is succesfully executed");
//       }else{
//           System.out.println("Query is not successfully updated");
//       }
                
        }catch(Exception e){
            System.out.println(e);
        }        
    }
    
}
