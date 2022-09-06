<%-- 
    Document   : index
    Created on : 18 Aug, 2022, 10:42:29 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practical 1</title>
        <script language="javascript">
            function addition()
            {
            var num1=parseInt(document.arithmetic.n1.value);
            var num2=parseInt(document.arithmetic.n2.value);
            var result=num1+num2;
            document.arithmetic.res.value=result;
            }
            function subtraction()
            {
            var num1=parseInt(document.arithmetic.n1.value);
            var num2=parseInt(document.arithmetic.n2.value);
            var result=num1-num2;
            document.arithmetic.res.value=result;
            }
            function multiplication()

            {
            var num1=parseInt(document.arithmetic.n1.value);
            var num2=parseInt(document.arithmetic.n2.value);
            var result=num1*num2;
            document.arithmetic.res.value=result;
            }
            function division()
            {
            var num1=parseInt(document.arithmetic.n1.value);
            var num2=parseInt(document.arithmetic.n2.value);
            var result=num1/num2;
            document.arithmetic.res.value=result;
            }
    </script>
    </head>
    <body>
        <h1>Mini Calculator</h1>
        <form name="arithmetic">
            <table>
                <tr>
                    <td>
                        Number 1
                    </td>
                    <td>
                        <input type ="text" name="n1" size="20">
                    </td>
                </tr>
                <tr>
                    <td>
                        Number 2
                    </td>
                    <td>
                        <input type ="text" name="n2" size="20">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="button" name="add" value="Add" onclick="javascript:addition();">&nbsp;
                        <input type="button" name="sub" value="Subtract" onclick="javascript:subtraction();">&nbsp;
                        <input type="button" name="mul" value="Multiply" onclick="javascript:multiplication();">&nbsp;
                        <input type="button" name="div" value="Division" onclick="javascript:division();">&nbsp;
                    </td>
                </tr>
                <tr>
                        <td colspan="2">Result is: <input type="text" name="res" size="20" value=""></td>
                </tr>
            </table>
        </form>
    </body>
</html>
