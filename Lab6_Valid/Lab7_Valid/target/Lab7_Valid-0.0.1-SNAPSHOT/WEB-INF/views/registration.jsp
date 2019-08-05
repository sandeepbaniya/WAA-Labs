<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<%--@declare id="gender"--%><h1>Registration Form</h1><br />
<form:form commandName="student"  method="POST">
    <p><form:errors path="*" cssStyle="color:red;"/></p>

    <label for="id"></label>
    <form:input path="id"/>

    <label for="firstName">First Name</label>
    <form:input  path="firstName" id="firstName"/>
    <form:errors path="firstName" cssStyle="color:red;"/>

    <label for="lastName">Last Name</label>
    <form:input type="text" path="lastName" id="lastName"/>
    <form:errors path="lastName" cssStyle="color:red;"/>

    <label for="email">Email</label>
    <form:input type="email" path="email" id="email" />
    <form:errors path="email" cssStyle="color:red;"/>


    <label for="phone">Phone</label>
    <form:input type="text" path="phone.area" id="phone" />
    <form:errors path="phone.area" cssStyle="color:red;"/>

     <form:input type="text" path="phone.prefix" id="phone" />
    <form:errors path="phone.prefix" cssStyle="color:red;"/>

     <form:input type="text" path="phone.number" id="phone" />
    <form:errors path="phone.number" cssStyle="color:red;"/>

    <label for="birthday">Date Of Birth</label>
    <form:input type="date" path="birthday" id="birthday" />
    <form:errors path="birthday" cssStyle="color:red;"/>

    <label for="gender">Gender</label>
    <form:checkbox  path="gender" value="male" />
    <form:checkbox  path="gender" value="female" />
    <form:errors path="gender" cssStyle="color:red;"/>

    <input type="submit" value="Registration">



</form:form>







































</body>
</html>