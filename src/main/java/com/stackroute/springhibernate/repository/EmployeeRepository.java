package com.stackroute.springhibernate.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.stackroute.springhibernate.config.HibernateUtil;
import com.stackroute.springhibernate.model.Employee;

public class EmployeeRepository {
	SessionFactory sessionFactory;
	Session session;
	
	public EmployeeRepository() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	public boolean sendStatus(Employee employee) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		return true;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAllStatus(){
		session = sessionFactory.openSession();
		return session.createQuery("from Employee order by postedDate desc").list();
		
	}
	
}
