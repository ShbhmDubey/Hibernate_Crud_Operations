/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.data.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aman
 */
public class HibernateUtil {
      static Configuration cfg=null;
        static SessionFactory sf=null;
        static Session session=null;
        
        static{
            try{
          
              cfg=new Configuration();
              System.out.println("Congi valuec is : "+cfg);
              cfg.configure("HBSaveOperation\\hibernate.cfg.xml");
              sf=cfg.buildSessionFactory();
              System.out.println("Session Factory ban chuka hai");

              
            }catch(HibernateException h){
               h.printStackTrace();
            }catch(Exception e){
               e.printStackTrace();
            }
        }
        public static Session getSession(){
            if(sf != null){
                session=sf.openSession();
            }
            System.out.println("Session object gya ....");
            return session;
        }
        
        public static void closeSession(Session session){
            if(session != null){
                session.close();
            }
            System.out.println("Session ko close kar dia gya hai");
        }
        
        public static void closeSessionFactory(SessionFactory sf){
            if(sf != null){
                sf.close();
            }
            System.out.println("Session factory bhi close ho rha hai ");
                // return sf;
        }
}
