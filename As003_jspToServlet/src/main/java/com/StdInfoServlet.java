package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/info")
public class StdInfoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String pass = req.getParameter("pass");

		System.out.println("FisrtName :" + fname);
		System.out.println("lastName :" + lname);
		System.out.println("Email :" + email);
		System.out.println("phone number :" + phone);
		System.out.println("Gender : " + gender);
		System.out.println("Password :" + pass);

		req.setAttribute(fname, fname);
		req.setAttribute(lname, lname);
		req.setAttribute(email, email);
		req.setAttribute(phone, phone);
		req.setAttribute(gender, gender);
		req.setAttribute(pass, pass);

		req.getRequestDispatcher("view.jsp").forward(req, resp);

	}
}
