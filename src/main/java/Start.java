import org.hibernate.SessionFactory;

public class Start {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSession();
        sessionFactory.close();
    }
}
