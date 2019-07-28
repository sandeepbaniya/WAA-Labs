 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
 <!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
<c:choose>
	<c:when test="${user eq null}">
		Click login to get Starbucks Advice!
		<form:form action="login" method="get">
			<input type="button" value="Login">
		</form:form>
	</c:when>

	<c:otherwise>
		<h2>Ask for advice about your favorite roast:</h2>
		<p>UserName: ${user.getName()}</p>

		<form action = "roastList" method="post">
			<select name="roastKey"   >
				<option value="-">  --Select Roast-- </option>

						<c:forEach var="roast" items="${roasts}">
							<option value="${roast.key}" > ${roast.value}</option>
						</c:forEach>
					</select>

			<p><input type="submit" value = "Submit"/></p>
		</form>

	<form:form action="logout" method="get">
		<input type="submit" value="Logout">
	</form:form>


	</c:otherwise>
</c:choose>

  
 </body>
</html>