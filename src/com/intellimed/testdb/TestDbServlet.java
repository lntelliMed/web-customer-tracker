package com.intellimed.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jdbcUrl = "jdbc:postgresql://localhost:5432/web_customer_tracker";
		String user = "springstudent";
		String pass = "springstudent"; 
		String driverClass = "org.postgresql.Driver";
		
		Connection connection = null;;
		try{
			Class.forName(driverClass);
			PrintWriter out = response.getWriter();
			out.println("Establishing a connection with: " + jdbcUrl);
			connection = DriverManager.getConnection(jdbcUrl, user, pass);
			out.println("Success!");
			
		} catch (Exception e){
			e.printStackTrace();
			throw new ServletException(e);
		} finally {
			try {
				if (connection != null){
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
