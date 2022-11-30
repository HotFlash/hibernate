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
                ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
            System.out.println(userDao.findAll());
            userDao.updateNameById(1L, "Zara");
            System.out.println(userDao.findAll());
            System.out.println(userDao.findByName("John"));
            userDao.save(new User("Bob1"));
            System.out.println(productDao.findAll());
            productDao.updatePriceById(2L,5000);
            System.out.println(productDao.findAll());
            productDao.deleteById(2L);
            System.out.println(productDao.findAll());
            productDao.save(new Product("box4", 400));
            System.out.println(productDao.findAll());

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
