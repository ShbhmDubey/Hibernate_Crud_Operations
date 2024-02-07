/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HBSaveOperation;

import in.data.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aman
 */
public class TestApp {
    public static void main(String[] args){
        Session session=null;
        Transaction tx=null;
        boolean flag=false;
        
        
        
       try{ 
       session=HibernateUtil.getSession();
      System.out.println("Session value is :"+session);
       
       if(session != null){
           tx=session.beginTransaction();
           System.out.println("Transaction value is :"+tx);
       }
       if(tx != null){
           Employee emp=new Employee();
           emp.setEmpId(37);
           emp.setEmpName("Shubham");
           emp.setEmpSal(2345.34);
           session.save(emp);
           flag=true;
       }
       }catch(HibernateException h){
           h.printStackTrace();
       }catch(Exception e){
           e.printStackTrace();
       }finally{
           if(flag==true){
               tx.commit();
           }else if(tx != null){
               tx.rollback();
           }
           HibernateUtil.closeSession(session);
       }
       
       
        
    }
}
