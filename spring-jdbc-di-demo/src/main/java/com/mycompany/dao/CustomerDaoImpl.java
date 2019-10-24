package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mycompany.model.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
public class CustomerDaoImpl implements CustomerDAO {

	private DataSource dataSource=null;
	
	
	
	
	
	
	@Override
	public void createCustomer(Customer customer) {
		Connection connection=null;
		 Statement statement=null;
		 PreparedStatement pStatement=null;
		
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(dataSource.toString());
		try {
			pStatement=connection.prepareStatement("insert into custmer(first_name,last_name,email) values(?,?,?)");
			pStatement.setString(1, customer.getFirstName());
			pStatement.setString(2, customer.getLastName());
			pStatement.setString(3, customer.getEmail());
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public CustomerDaoImpl(DataSource dataSource) {
		
		this.dataSource = dataSource;
	}

}
