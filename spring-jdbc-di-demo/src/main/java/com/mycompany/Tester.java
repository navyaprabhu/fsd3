package com.mycompany;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.dao.CustomerDAO;
import com.mycompany.dao.CustomerDaoImpl;
import com.mycompany.model.Customer;

public class Tester {
	public static void main(String[] args) {

		try {

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerDAO customerDao = context.getBean("customerDao", CustomerDaoImpl.class);

			customerDao.createCustomer(new Customer("Sourav", "Ganguly", "sourav@luv2code.com"));
			System.out.println("ok!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
