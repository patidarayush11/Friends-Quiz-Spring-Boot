<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>

<html>
<body>


   <table border="1">
   		<tr>
    		<th>Name</th>
    		<th>Score</th>
  		</tr> 
   <c:forEach var="q" items="${friendScores}">
                <tr>
                    <td><c:out value="${q.name}" /></td>
                    <td><c:out value="${q.score}" /></td>
                </tr>
   </br>
   </c:forEach>

</table>
 

</body>
</html>

