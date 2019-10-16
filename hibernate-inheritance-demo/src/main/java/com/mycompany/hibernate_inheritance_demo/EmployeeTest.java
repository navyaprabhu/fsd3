package com.mycompany.hibernate_inheritance_demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
					.addAnnotatedClass(Manager.class)
					.addAnnotatedClass(Hr.class).buildSessionFactory();
			Session session = factory.openSession();
			Employee emp = new Employee("navya", 22, new Date());
			Manager mg= new Manager("Rohit", 35, new Date(),
					"Cloud",20);
			Hr h= new Hr("giri", 50, new Date(),"management",20, "public speaker");
		session.getTransaction().begin();
			session.save(emp);
			session.save(mg);
			session.save(h);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}