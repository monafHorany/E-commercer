package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoggingIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoggingIn() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("username");
			String password = request.getParameter("password");
			String dbName = null;
			String dbPassword = null;
			String sql = "select * from Users where uname = ? and password = ?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Istanbulaydin");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			PrintWriter out = response.getWriter();
			while (rs.next()) {
				dbName = rs.getString(2);
				dbPassword = rs.getString(3);
				
			}
			if (name.equals(dbName)&&password.equals(dbPassword)) {
				out.println("<p style= 'font-size:34px; text-align:center;'>hello "+ name + "</p>");
			}else {
				response.sendRedirect("login.jsp");
			}
	
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
