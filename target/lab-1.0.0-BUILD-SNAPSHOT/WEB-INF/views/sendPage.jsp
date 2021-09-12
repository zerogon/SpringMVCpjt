<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	전송페이지 입니다. 
	
</h1>
	<form action="${ pageContext.servletContext.contextPath }/page/sendPagePro" method="POST">
		<font>아이디: </font><input type="text" name="id"/><p>
		<font>암호: </font><input type="text" name="pwd"/><p>
		<button type="submit">로그인</button>
	</form>
</body>
</html>
