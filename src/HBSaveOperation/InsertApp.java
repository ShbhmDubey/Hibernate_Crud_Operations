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
public class InsertApp {
    
    public static void main(String[] args){
        
        Session session = null;
        Transaction tr=null;
        boolean flag=false;
    
    try{
       session=HibernateUtil.getSession(); 
       if(session != null){
           tr=session.beginTransaction();
       }
                   
        if(tr != null){
            Employee emp=new Employee();
            emp.setEmpId(8);
            emp.setEmpName("Amit Shukla");
           emp.setEmpSal(4000.32);
           session.persist(emp);//perform Save Operation
           flag=true;
           System.out.println(emp);
        }
       
    }catch(HibernateException h){
        h.printStackTrace();
    }finally{
        if(flag==true){
            tr.commit();
            
        }else{
            tr.rollback();
        }
        HibernateUtil.closeSession(session);
        
    }
    
    }
    
}

    