package vn.edu.eiu.testservletrequest;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/redirect-servlet"})
public class RedirectServlet extends HttpServlet {
	/*
	 * Có 2 cách để chuyển trang trong servlet
	 * */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Cách 1
		//resp.sendRedirect("/Lab0103ServletRequestResponse/form-request");
		
		//Cách 2
		resp.setStatus(resp.SC_MOVED_PERMANENTLY);
		resp.setHeader("Location", "/Lab0103ServletRequestResponse/form-request");

	}
}
