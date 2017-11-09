<%-- 
    Document   : index
    Created on : Nov 8, 2017, 11:21:44 AM
    Author     : Welcome
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Client</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact No</th>
                <th>Status</th>
            </tr>
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.firstName} ${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <td>${customer.contactNo}</td>
                    <td>${customer.status}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
