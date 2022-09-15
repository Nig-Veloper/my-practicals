<%-- 
    Document   : index
    Created on : 12 Sep, 2022, 11:02:51 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            org.tempuri.WebService1 obj = new org.tempuri.WebService1();
            org.tempuri.WebService1Soap port = obj.getWebService1Soap();
            
            int num1 = Integer.parseInt(request.getParameter("txt1"));
            int num2 = Integer.parseInt(request.getParameter("txt2"));
            
            int a = num1;
            int b = num2;
            
            int result1 = port.aor(a, b);
            int result2 = port.aos(a);
            
            out.print("Result 1: AOR "+ result1);
            out.print("Result 2: AOS "+ result2);

        %>
    </body>
</html>
