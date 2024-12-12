package crudservlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudservlet.dao.StudentDao;
import crudservlet.dto.StudentDto;
@WebServlet("/update")
public class Modify extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("sname");
		String mob=req.getParameter("smob");
		long cmob=Long.parseLong(mob);
		String email=req.getParameter("semail");
		String pwd=req.getParameter("spwd");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		
		System.out.println(name+" ");
		
		StudentDto dto = new StudentDto();
		dto.setName(name);
		dto.setMobile(cmob);
		dto.setEmail(email);
		dto.setPassword(pwd);
		dto.setGender(gender);
		dto.setCountry(country);
		
		
		StudentDao dao = new StudentDao();
		dao.update(dto);
		
		Object o=dao.fetchAll();
		req.setAttribute("key", o);
		RequestDispatcher	rd= req.getRequestDispatcher("fetchall.jsp");
		rd.forward(req, resp);

	}
}
