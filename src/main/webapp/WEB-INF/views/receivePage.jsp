<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	수신받은 페이지 입니다.
</h1>

<P>  이메일값은 ${usrVO.email}. </P>
<P>  암호값은 ${usrVO.password}. </P>
</body>
</html>
