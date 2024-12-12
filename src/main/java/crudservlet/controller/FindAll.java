package crudservlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudservlet.dao.StudentDao;
import crudservlet.dto.StudentDto;
@WebServlet("/fa")
public class FindAll extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		StudentDao dao = new StudentDao();
		List<StudentDto> o = dao.fetchAll();
		resp.getWriter().print(o);
		req.setAttribute("key", o);
	RequestDispatcher	rd= req.getRequestDispatcher("fetchall.jsp");
	rd.forward(req, resp);
		
	}
}
