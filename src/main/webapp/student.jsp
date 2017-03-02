<%@page import="java.util.List"%>
<html>
<body>
	<jsp:include page="header.jsp" />
	<h2>Student Registration</h2>
	<form action="register" method="post">
		Name: <input type="text" name="name"> Mobile: <input
			type="text" name="phone"> 
			<select name="course">
			<%
			   List<String> courses = (List<String>)request.getAttribute("courseList");
			 if(courses != null){
				 for(String course : courses){
					  out.print("<option>"+course+"</option>");
				  }
			 }
		    %>
		</select> 
		<input type="submit" value="Register">
	</form>
</body>
</html>
