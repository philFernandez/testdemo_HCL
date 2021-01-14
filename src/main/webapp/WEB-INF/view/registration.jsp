<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
</head>
<body>
    <h1>Register New User</h1>
    <hr>
    <form:form modelAttribute="user">
        <table>
            <tr>
                <td>
                    <form:label path="username">User Name</form:label>
                </td>
                <td>
                    <form:input path="username" />
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="password">Password</form:label>
                </td>
                <td>
                    <form:input path="password" />
                </td>
            </tr>
        </table>
        <input type="submit" value="Register" />
    </form:form>
    
</body>
</html>