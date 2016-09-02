package main.baseDao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import main.util.HibernateUtil;

/**
 * Aug 24, 2016
 * 
 * @author galip
 *
 */
public class BaseDao {
	
	public static Session getHibernateSession() {
		return HibernateUtil.getSessionFactory().openSession();
	}

	public void save(Object o) {
		Session session = getHibernateSession();
		try {
			session.beginTransaction();
			session.save(o);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}

	public void delete(Object o, int id) {
		Session session = getHibernateSession();
		try {
			session.beginTransaction();
			String hql = "update " + o.getClass().getSimpleName() + " set deleted = 'TRUE' WHERE id = " + id;
			session.createSQLQuery(hql).executeUpdate();
			session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
	}


	@SuppressWarnings("unchecked")
	public <T> List<T> getAllList(Object clazz) {
		Session session = getHibernateSession();
		List<T> lists = null;
		try {
			session.beginTransaction();
//			lists = session.createCriteria(clazz.getClass()).list();
			String hql = "FROM " + clazz.getClass().getSimpleName() + " where deleted = 'FALSE'";
			Query query = session.createQuery(hql);
			lists = query.list();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return lists;
	}
}