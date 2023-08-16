package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.ineuron.model.Employee;
import in.ineuron.util.HibernateUtil;

public class RetreivalApp {

	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			Employee employee = session.get(Employee.class, 1);
			System.out.println(employee);

		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
