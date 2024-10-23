package vn.edu.eiu.testservletrequest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/form-request"})
public class FormRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<h1>Form nhap</h1>");
		writer.println("<form action='/Lab0103ServletRequestResponse/form-response' method='post'>");
		writer.println("Name: <input type='text' name='name'>");
		writer.println("Course: <input type='text' name='course'>");
		writer.println("<input type='submit' value='Send'>");
		writer.println("</form>");
	}	
}
