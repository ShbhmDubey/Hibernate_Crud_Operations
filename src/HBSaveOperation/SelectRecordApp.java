/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HBSaveOperation;

import in.data.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author aman
 */
public class SelectRecordApp {
    
    
    public static void main(String[] args){
        Session session=HibernateUtil.getSession();
        

        Employee emp=null;
        try{
            int id=37;
            if(session != null){
                emp=session.load(Employee.class, id);
            }
            if(emp != null){
                System.out.println(emp);
            }else{
                System.out.println("Data is not Present in the Database for id "+id);
            }
        
        }catch(HibernateException h){
            h.printStackTrace();
        }
    }
}
