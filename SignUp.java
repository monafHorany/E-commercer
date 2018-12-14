package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SignUp() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("username");
			String password = request.getParameter("password");
			String sql = "insert into Users(uname, password) values(?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Istanbulaydin");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.executeUpdate();
			PrintWriter out = response.getWriter();
			out.println("Your account has been successfully created");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
