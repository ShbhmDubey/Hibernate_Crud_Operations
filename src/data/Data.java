/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data;
import java.sql.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author aman
 */
class B{
   static{
    System.out.println("Class B is Loaded completely");
} 
}
class A extends B{
static{
    System.out.println("Class A is Loaded completely");
}

}
public class Data extends A{
    static{
        System.out.println("My First class is loaded");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
        //  DriverManager.registerDriver( new com.mysql.jdbc.Driver());
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Class name ");
        String str=scn.next();
        System.out.println("Bahut Mehnat k baad bna hai");
        Class c=Class.forName(str);
        System.out.println(c);
      }catch(Exception e){
          System.out.println("Hiii");
          System.out.println(e);
      }
    }
    
}
