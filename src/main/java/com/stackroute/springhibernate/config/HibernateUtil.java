package com.stackroute.springhibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();	
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
