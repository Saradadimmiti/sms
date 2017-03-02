package in.javahome.sms.servlets;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.javahome.sms.dao.StudentDAO;
@WebServlet("/register")
public class RegisterStudentServlet extends HttpServlet {
	StudentDAO stdDao = new StudentDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// This is to display the form with drop down data
		// Make a call to DAP which should return List<String>
		req.setAttribute("courseList", Arrays.asList("Java","AngularJS","AWS","DevOPs"));
		req.getRequestDispatcher("student.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Create Student entity
		// set values to the entity
		stdDao.registerStudent(null);
	}
}
