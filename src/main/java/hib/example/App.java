package hib.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {

    public static void main( String[] args ) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        SessionFactoryUtils.init();
        try {

                UserDao userDao = new UserDaoImpl(sessionFactoryUtils);
            System.out.println(userDao.findAll());
            userDao.updateNameById(1L, "Zara");
            System.out.println(userDao.findAll());
            System.out.println(userDao.findByName("John"));
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
