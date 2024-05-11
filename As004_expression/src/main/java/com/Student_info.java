package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class Student_info extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String gender = req.getParameter("gender");
		String pass = req.getParameter("pass");

		System.out.println("first name :" + fname);
		System.out.println("last name :" + lname);
		System.out.println("email :" + email);
		System.out.println("mobile :" + mobile);
		System.out.println("gender :" + gender);
		System.out.println("pass :" + pass);

		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("email", email);
		req.setAttribute("mobile", mobile);
		req.setAttribute("gender", gender);
		req.setAttribute("pass", pass);

		req.getRequestDispatcher("view.jsp").forward(req, resp);
	}
}
