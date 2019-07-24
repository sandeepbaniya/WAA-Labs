<%--
  Created by IntelliJ IDEA.
  User: baniy
  Date: 7/22/2019
  Time: 10:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

    <form action='/calc2' method='get'>
        <input type = 'text' size = '2' name = 'add1' " + "value = " +  add1 +" />
        <input type = 'text' size = '2' name = 'add2'"  + "value = " +  add2 + " />
        <input type = 'text' size ='4' name = 'sum'"   + "value = " +  sum + " readonly  /> <br/>
        <input type = 'text' size = '2' name = 'mult1'" + "value = " +  mult1 + " />
        <input type = 'text' size = '2' name = 'mult2'" + "value = " +  mult2 + "  />
        <input type = 'text' size = '4' name = 'product'" + "value = " + product + " readonly  /><br/>
        <input type = 'submit' value = 'Submit'/>
    </form>




</body>
</html>
