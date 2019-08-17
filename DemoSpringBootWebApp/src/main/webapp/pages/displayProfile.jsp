<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<!-- The request goes to controller, which calls this page   -->
</head>
<body>

	Welcome ${obj.uname}, a ${obj.uoccupation} from ${obj.uarea}! <br>
	User ID is ${obj.uid}. Personal link is ${obj.uurl}.
</body>
</html>