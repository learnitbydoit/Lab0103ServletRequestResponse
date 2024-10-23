package vn.edu.eiu.testservletrequest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/get-request"})
public class GetRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<h1>Get resquest testing!</h1>");
		
		String name = req.getParameter("name");//"name" được truyền thông qua url, form (get)
		String course = req.getParameter("course");
		
		writer.println("<h2>xin chào " + name + "</h2>");
		writer.println("<h2>Chào mừng bạn đến với khóa học " + course + "</h2>");
		writer.close();		
	}
}
