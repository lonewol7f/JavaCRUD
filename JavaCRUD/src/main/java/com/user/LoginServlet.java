package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.UserDBUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String passwd = request.getParameter("passwd");
		
		if (UserDBUtil.login(uname, passwd)) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			
			RequestDispatcher dispatcher =request.getRequestDispatcher("/userProfile.jsp");
			dispatcher.forward(request, response);
			System.out.println("Login Success");
		}else {
			System.out.println("Invalid credintials!!!");
		}
	}

}
