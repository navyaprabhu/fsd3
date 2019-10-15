package com.mycompany.hibernate_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_mapping.model.instructor;
import com.mycompany.hibernate_mapping.model.instructor_detail;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(instructor.class)
				.addAnnotatedClass(instructor_detail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		instructor_detail detail = new instructor_detail();
		detail.setYoutube("http://youtube.com");
		detail.setTwitter("http://twitter.com");
		instructor info = new instructor();
		info.setFname("navya");
		info.setLname("prabhu");
		info.setEmail("navya@gmail.com");
		info.setDetails(detail);
		session.getTransaction().begin();
		session.persist(detail);
		session.persist(info);
		session.getTransaction().commit();
		session.close();

	}
}