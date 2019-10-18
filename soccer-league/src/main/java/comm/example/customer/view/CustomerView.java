package comm.example.customer.view;
/*
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import comm.example.customer.model.Customer;


public class CustomerView extends HttpServlet {
	private static final long serialVersionUID = 1L;
private List<Customer> list=null;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		list=new ArrayList<Customer>();
		list.add(new Customer("Normal",1001,"Sreejitha"));
		list.add(new Customer("Corperate", 1002, "Shefali"));
		list.add(new Customer("Corperate", 1003, "Shreshta"));
		out.println("<html><title>List All Customer/title><body><table border='1'><tr><td>Type</td><td>Id</td><td>Name</td></tr>");
		
		for(Customer l1:list)
		{
			out.println("<tr><td>"+l1.getType()+"</td><td>"+l1.getId()+"</td><td>"+l1.getName()+"</td></tr>");
			
		}
		out.println("</table><a href='index.html'>Go To Home Page</a></body></html>");
		
	}

	
}
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.League;

public class CustomerView extends HttpServlet {
	private static final long serialVersionUID = 1L;
private List<League> list=null;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		list=new ArrayList<League>();
		list.add(new League("normal",209,"Sreejitha"));
		list.add(new League("corperate", 210, "Shefali"));
		list.add(new League("normal", 211, "shreshta"));
		out.println("<html><title>List All Customer League</title><body><table border='1'><tr><td>Type</td><td>Name</td><td>Id</td></tr>");
		
		for(League l:list)
		{
			out.println("<tr><td>"+l.getSeason()+"</td><td>"+l.getTitle()+"</td><td>"+l.getYear()+"</td></tr>");
		}
		out.println("</table><a href='index.html'>Go To Home Page</a></body></html>");
		
	}

	
}

