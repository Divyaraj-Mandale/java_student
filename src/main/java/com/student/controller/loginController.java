package com.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.DAOservice;
import com.student.model.DAOserviceImpl;
@WebServlet("/login")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public loginController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
	
		DAOservice service=new DAOserviceImpl();
		service.connectDB();
		
		boolean status = service.verifycon(email, password);
	
		if (status==true) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/registration.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", "invalid username/ password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	
	}

}
