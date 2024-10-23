package vn.edu.eiu.testservletrequest;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet-request"})
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Method: " + req.getMethod());
		System.out.println("Server name: " + req.getServerName());
		System.out.println("Cookies: " + req.getCookies());
		System.out.println("Path: " + req.getContextPath());
		System.out.println("Server Port: " + req.getServerPort());
		System.out.println("Content type: " + req.getContentType());
		
		//Lấy thông tin trong HeaderNames()
		
		Enumeration<String> names = req.getHeaderNames();
		
		//xuất
		System.out.println("Các thông tin trong headnames: ");
		while(names.hasMoreElements())
		{
			String name = names.nextElement();
			System.out.println(name + " " + req.getHeader(name));
		}
	}
}
