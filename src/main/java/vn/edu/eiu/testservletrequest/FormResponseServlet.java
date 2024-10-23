package vn.edu.eiu.testservletrequest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/form-response")
public class FormResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Client gửi yêu cầu lên server bằng phương thức POST
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();

		String name = req.getParameter("name");
		String course = req.getParameter("course");

		writer.println("<h2>xin chào " + name + "</h2>");
		writer.println("<h2>Chào mừng bạn đến với khóa học " + course + "</h2>");
		writer.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();
		
		String name = req.getParameter("name");
		String course = req.getParameter("course");
		
		writer.println("Xử lý dữ liệu gửi bằng phương thức GET");
		writer.println("<h2>xin chào " + name + "</h2>");
		writer.println("<h2>Chào mừng bạn đến với khóa học " + course + "</h2>");
		writer.close();
	}
}
