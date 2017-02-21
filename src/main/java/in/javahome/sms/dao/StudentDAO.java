package in.javahome.sms.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.sms.entity.Student;
import in.javahome.sms.util.HibernateUtil;

public class StudentDAO {
	public void registerStudent(Student std) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(std);
			tx.commit();
		}
	}
}
