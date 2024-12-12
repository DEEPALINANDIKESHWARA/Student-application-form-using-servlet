<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<input type="text" name="sname" value="<%=request.getParameter("name")%>" > <br>
<input type="number" name="smob" value="<%=request.getParameter("mobile")%>" > <br>
<input type="hidden" name="semail" value="<%=request.getParameter("email")%>"> <br>
<input type="password" name="spwd" value="<%=request.getParameter("password")%>" > <br>
male:<input type="radio" name="gender" > <br>
female<input type="radio" name="gender"  > <br>
<select name="country">
<option>INDIA</option>
<option>GERMANY</option>
<option>THAILAND</option>
<option>SHRILANKA</option>
</select> <br>
<button>update</button>
<button>cancel</button>
</form>
</body>
</html>