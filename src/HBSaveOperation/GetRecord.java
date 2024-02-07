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
public class GetRecord {
    
    public static void main(String[] args ){
        Session session=HibernateUtil.getSession();
        Employee emp=null;
        int id=37;
        try{
            if(session != null){
                emp=session.get(Employee.class, id);
            }
            if(emp != null){
                System.out.println(emp);
            }else{
                System.out.println("Employee record is not available for id "+id);
            }
            
        }catch(HibernateException h){
            h.printStackTrace();
        }finally{
            
        }
        
        
    }
}
