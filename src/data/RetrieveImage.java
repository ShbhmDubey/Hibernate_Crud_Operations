/*
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
public class RetrieveImage {
    public static void main(String[] args){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubhamdb", "root","root");
             PreparedStatement ps=c.prepareStatement("select * from imgtable");
             ResultSet rs=ps.executeQuery();
             rs.next();
             Blob b=rs.getBlob(2);
             byte[] barr=new byte[(int)b.length()];
             barr=b.getBytes(1, (int)b.length());
                String file=System.getProperty("user.dir");
           System.out.println(file);
           file=file+"\\build\\classes\\data\\b.jpeg";
             FileOutputStream fout=new FileOutputStream(file);
             fout.write(barr);
             fout.close();
             System.out.println("Image is successfully stored");
             
             
             
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
