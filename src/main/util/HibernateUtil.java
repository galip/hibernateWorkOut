package main.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			return new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.out.println("buildSessionFactory()");
			throw new ExceptionInInitializerError(ex);
		}
		
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		getSessionFactory().close();
	}
}