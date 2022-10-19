package com.student.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.DAOservice;
import com.student.model.DAOserviceImpl;
@WebServlet("/listRegController")
public class listRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public listRegController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		DAOservice service=new DAOserviceImpl();
		service.connectDB();
		
		ResultSet result=service.getListRegistration();
		
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/getList.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
