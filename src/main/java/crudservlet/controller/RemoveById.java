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

@WebServlet("/did")
public class RemoveById extends HttpServlet {
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String email = req.getParameter("pk");
	System.out.println(email);
	
	StudentDao studentDao=new StudentDao();
	String msg=studentDao.deleteById(email);
//	resp.getWriter().print(msg);
	
List<StudentDto> obj=studentDao.fetchAll();
req.setAttribute("key", obj);

  RequestDispatcher r = req.getRequestDispatcher("fetchall.jsp");
    r.forward(req, resp);
	
}
}
