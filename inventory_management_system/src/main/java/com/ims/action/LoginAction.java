package com.ims.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ims.services.UserService;
import com.ims.services.UserServiceImpl;

public class LoginAction {
	public String process(HttpServletRequest request, HttpServletResponse response) {
		UserService service = new UserServiceImpl();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isValid = service.verifyUser(username, password);
		if(isValid) {
			request.setAttribute("name", username);
			return "/WEB-INF/home.jsp";
		}
		request.setAttribute("message", "Invaild username and password");
		return "index.jsp";
	}
}
