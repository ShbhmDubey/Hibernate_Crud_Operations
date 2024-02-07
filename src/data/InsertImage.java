/*lol;l;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.sql.*;
import java.io.*;


/**
 *
 * @author aman
 */
public class InsertImage {
    
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubhamdb", "root","root");
         
            String file=System.getProperty("user.dir");
           System.out.println(file);
           file=file+"\\build\\classes\\data\\s.jpeg";
           PreparedStatement ps=c.prepareStatement("insert into imgtable values(?,?)");
           
           FileInputStream fin=new FileInputStream(file);
           ps.setString(1, "Shubham");
           ps.setBinaryStream(2,fin,fin.available());
           int val=ps.executeUpdate();
           System.out.println(val+" Image is stored successfully");
           c.close();
           
           
           
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    
}
