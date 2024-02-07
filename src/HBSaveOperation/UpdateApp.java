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
public class UpdateApp {
    
    public static void main(String[] ars){
        Session session=null;
        Transaction tr=null;
        boolean flag=false;
        session=HibernateUtil.getSession();
        Employee emp=new Employee();
        emp.setEmpId(8);
        emp.setEmpName("Shubh");
        emp.setEmpSal(346.423);
        
        try{
             if(session != null){
                 tr=session.beginTransaction();
                 session.update(emp);
                 flag=true;
                 System.out.println(emp);
                         
             }       
        }catch(HibernateException h){
            h.printStackTrace();
        }finally{
            if(flag){
                tr.commit();
            }else{
                tr.rollback();
            }
            HibernateUtil.closeSession(session);
        }
    }
}
