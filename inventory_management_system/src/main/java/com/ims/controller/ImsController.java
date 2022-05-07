package com.ims.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ims.action.LoginAction;


@WebServlet("*.ims")
public class ImsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ImsController() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		String result="";
		if(uri.endsWith("login.ims")) {
			LoginAction login=new LoginAction();
			result = login.process(request, response);
		}
		request.getRequestDispatcher(result).forward(request, response);
		
	}

}
