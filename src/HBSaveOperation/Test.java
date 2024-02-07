/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HBSaveOperation;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aman
 */
public class Test {
    
    public static void main(String[] args){
             Configuration cfg=new Configuration();  
             cfg.configure("HBSaveOperation\\hibernate.cfg.xml");
             SessionFactory sf=cfg.buildSessionFactory();
        try (Session session = sf.openSession()) {
            Transaction tr=session.beginTransaction();
            Employee emp=new Employee();
            emp.setEmpId(10);
            emp.setEmpName("Sachin");
            emp.setEmpSal(405.5);
            
            Serializable object=session.save(emp);
            System.out.println(object);
            tr.commit();
        }
             
        
        
    }
}
