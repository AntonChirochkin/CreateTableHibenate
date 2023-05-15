import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import java.lang.module.Configuration;

public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();

        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    static SessionFactory getSession() throws HibernateException {
        return ourSessionFactory;
    }

}
