/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HBSaveOperation;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aman
 */
public class StandardHBApp {
    
    
    public static void main(String[] args){
        Configuration cfg=null;
        SessionFactory sf=null;
        Session session=null;
        Transaction tx=null;
        Integer idValue=null;
        boolean flag=false;
        ArrayList i=new ArrayList();
        i.add(cfg);
        i.add(sf);
        i.add(session);
        i.add(tx);
        i.add(idValue);
        i.add(flag);
        
        cfg=new Configuration();
        cfg.configure("HBSaveOperation\\hibernate.cfg.xml");
        System.out.println(cfg.getProperties());
        
        sf=cfg.buildSessionFactory();
        
        session=sf.openSession();
        Employee emp=new Employee();
        emp.setEmpId(12);
        emp.setEmpName("Shubham");
        emp.setEmpSal(232.4);
        
        try{
            tx=session.beginTransaction();
            idValue=(Integer)session.save(emp);
           flag=true;
           System.out.println("Generated id vaue is "+ idValue);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
        if(flag==true){
            tx.commit();
            
        }else{
            tx.rollback();
        }
        session.close();
        sf.close();
        
    }
    }
}
