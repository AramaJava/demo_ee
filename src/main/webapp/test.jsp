<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP - Test</title>
</head>
<body>
<h1>Testing JSP</h1>
<p>
    <%@ page import="java.util.Date, ru.maxima.TestClass" %>
    <% TestClass testClass = new TestClass();%>
    <%= "" + testClass.getInfo() %>
    <br/>
    <%= "String from JSP "%>
    <% new Date(); %>

</p>
</body>
</html>
