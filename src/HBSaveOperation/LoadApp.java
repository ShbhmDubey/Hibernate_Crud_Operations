/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HBSaveOperation;

import in.data.util.HibernateUtil;
import java.io.IOException;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author aman
 */
public class LoadApp {
    
    public static void main(String[] args) throws IOException{
         Session session=HibernateUtil.getSession();
        Employee emp=null;
        int id=3;
        try{
            if(session != null){
                emp=session.load(Employee.class, id);
            }
            if(emp != null){
                System.out.println("Employee id is "+emp.getEmpId());
                System.in.read();
                System.out.println("Employee name is "+emp.getEmpName());
                System.out.println("Employee salary is "+emp.getEmpSal());
                
            }else{
                System.out.println("Employee record is not available for id "+id);
            }
            
        }catch(HibernateException h){
            h.printStackTrace();
        }finally{
            
        }

    }
    
}
