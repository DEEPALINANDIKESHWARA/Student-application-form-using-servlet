package crudservlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudservlet.dao.StudentDao;
@WebServlet("/da")
public class DeleteAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDao studentDao = new StudentDao();
		String msg = (String) studentDao.deleteAll();
		resp.getWriter().print(msg);
	
	}

}
