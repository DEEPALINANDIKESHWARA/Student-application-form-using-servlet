<%@page import="crudservlet.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<StudentDto> l = (List<StudentDto>) request.getAttribute("key");  %>
<table border="3px">
<tr>
<th>email</th>
<th>password</th>
<th>mobile</th>
<th>name</th>
<th>gender</th>
<th>country</th>
<th>delete</th>
<th>update</th>
</tr>

<% for(StudentDto s:l){ %>
<tr>
<td><%=s.getEmail()%> </td>
<td><%=s.getPassword()%> </td>
<td><%=s.getMobile()%> </td>
<td><%=s.getName()%> </td>
<td><%=s.getGender()%> </td>
<td><%=s.getCountry()%> </td>
<td><a href="did?pk=<%=s.getEmail()%>">delete</a></td>
<td><a href="update.jsp?email=<%=s.getEmail()%>&&password=<%=s.getPassword()%>&&mobile=<%=s.getMobile()%>&&name=<%=s.getName()%>&&gender=<%=s.getGender()%>&&country=<%=s.getCountry()%>">update</a></td>
</tr>
<%}%>


</table>
</body>
</html>