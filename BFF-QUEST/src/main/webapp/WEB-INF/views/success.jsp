<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>

<html>
<head>
    <title>Success</title>
</head>
<body>
<h2>Welcome ${person.name} !!!!</h2>

<form action="http://localhost:8181/questions" method="post">
 
 <input type="hidden" name="personId" value="${person.id}">
 
<input type="submit" value="Dig On the Questions">
</form>
</body>
</html>