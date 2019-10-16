package com.mycompany.hibernate_inheritance_demo.table_per_concrete_class;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CDTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(CD.class)
					.addAnnotatedClass(SpecialEditionCD.class).addAnnotatedClass(InternationalCD.class)
					.buildSessionFactory();
			Session session = factory.openSession();
			CD cd = new CD(" Pressure", "Rush", new Date(), 8.67);
			cd.setId(100);
			SpecialEditionCD secd = new SpecialEditionCD(" Pressure", "Rush", new Date(), 8.67,
					"Widescreen");
			secd.setId(110);
			InternationalCD icd = new InternationalCD(" Pressure", "Rush", new Date(), 8.67, "england", 4);
		icd.setId(120);
			session.getTransaction().begin();
			session.save(cd);
			session.save(secd);
			session.save(icd);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
