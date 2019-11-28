<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>

<html>
<body>
<form method="post" action="evalScore">
<input type="hidden" name="personId" value="${personId}">
Enter your name : <input type="text" name="friendName" /><br>
   <table> 
   <c:forEach var="q" items="${allQuestions}">
                <tr>
                    <td><c:out value="${q.ques_text}" /></td>
					<td>
					<input type="radio" name="${q.ques_id}" value="${q.opt_1}"><c:out value="${q.opt_1}" /><br>
                   
                    <input type="radio" name="${q.ques_id}" value="${q.opt_2}"><c:out value="${q.opt_2}" /><br>
                   
                    <input type="radio" name="${q.ques_id}" value="${q.opt_3}"><c:out value="${q.opt_3}" /><br>
                   
                    <input type="radio" name="${q.ques_id}" value="${q.opt_4}"><c:out value="${q.opt_4}" /><br>
                	</td>
                </tr>
    </br>
   </c:forEach>

</table>
  <input type="submit" value="Submit">
</form>

</body>
</html>

