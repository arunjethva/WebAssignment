package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletConfig extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();

		ServletConfig cf = (ServletConfig)getServletConfig();
		String uname = cf.getInitParameter("uname");
		String pass = cf.getInitParameter("pass");

		pw.append(uname);
		pw.append(pass);

	}
}
