/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neuron;
import java.util.*;
import java.io.*;

/**
 *
 * @author aman
 */
class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}
class Account{
    static int accountNum=1111;
    static int password=2222;
    int acNum;
    int pass;
    Scanner scn=null;
    public void input(){
        scn=new Scanner(System.in);
        System.out.println("Enter the account Num: ");
        acNum=scn.nextInt();
        System.out.println("Please enter the password: ");
        pass=scn.nextInt();
    }
    public void verify()throws CustomException{
        if(accountNum==acNum && password==pass){
            System.out.println("Enter the anmount which you want to debit: ");
            int amount=scn.nextInt();
            System.out.println("Please collect your amount "+amount);
        }else{
            throw new CustomException("Please enter the correct INFORMATION ");
        }
    }
}
public class Test {
    
    public static void main(String[] args){
        Test t=new Test();
        Account a=new Account();
        try{
            a.input();
            a.verify();
        }catch(CustomException ce){
            try{
                ce.getMessage();
                a.input();
                a.verify();
            }catch(CustomException cf){
                try{
                    cf.getMessage();
                    a.input();
                    a.verify();
                }catch(CustomException cg){
                    System.out.println("Your card is BLOCKED!!!!");
                    System.out.println("Please contact to nearest Branch:----"+t);
                    System.exit(0);
                }
            }
        }
    }
}
