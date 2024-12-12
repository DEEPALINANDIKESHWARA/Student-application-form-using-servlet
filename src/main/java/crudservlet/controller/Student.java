package crudservlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudservlet.dao.StudentDao;
import crudservlet.dto.StudentDto;
@WebServlet("/su")
public class Student extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("sname");
		String mob=req.getParameter("smob");
		String email=req.getParameter("semail");
		String pwd=req.getParameter("spwd");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		
		
		StudentDto s1 = new StudentDto();
		s1.setName(name);
		long cmob=Long.parseLong(mob);
		s1.setMobile(cmob);
		s1.setEmail(email);
		s1.setPassword(pwd);
		s1.setGender(gender);
		s1.setCountry(country);
		System.out.println(s1);
		
		
		StudentDao studentDao = new StudentDao();
		String msg = studentDao.insert(s1);
		resp.getWriter().print(msg);
	}
}
