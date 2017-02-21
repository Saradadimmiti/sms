package in.javahome.sms.servlets;

import java.io.IOException;

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
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Create Student entity
		// set values to the entity
		stdDao.registerStudent(null);
	}
}
