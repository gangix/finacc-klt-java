<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>User Store Application</title>
</head>
<body>
<a href="/index/">Add Again</a>
		<h2 align="center">Thank you for your information!</h2>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h3>List of Users</h3></caption>
            <tr>
		<th>Id</th>
                <th>Name</th>
                <th>LastName</th>
                <th>Age</th>
		<th>Action</th>
            </tr>
            <c:forEach var="user" items="${userList}">
                <tr>
                 	<td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.firstName}" /></td>
                    <td><c:out value="${user.lastName}" /></td>
                    <td><c:out value="${user.age}" /></td>
                    <td><a href="/delete/${user.id}">Delete</a></td>  
                </tr>
            </c:forEach>
        </table>
    </div>	
</body>
</html>
