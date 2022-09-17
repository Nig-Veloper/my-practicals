<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="practical8AJAx.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <script type="text/javascript" src="jQuery.js"> </script>
    <script type="text/javascript">
        $(document).ready(function (){ //loads the jQuery
            $("#btn").click(function () {
                var num1 = $("#txt1").val(); //took input1 from textbox1
                var num2 = $("#txt2").val(); //took input2 from textbox2
                $.ajax({
                    url: "Service1.svc/sum",

                    type: "POST",
                    contentType: "application/json; charset=utf-8",
                    data: JSON.stringify({ a: num1, b: num2 }),

                    dataType: "json",
                    success: function (data) { $("#txt3").val(data.d); }, //"data.d" is for printing result in txt3(textbox3)
                    error: function (err) {
                        alert(err);
                    }
                });
            });
        });
    </script>
    <title></title>
</head>
<body>

    <form id="form1" runat="server">
        <div>
            Enter First Number: <input id="txt1" type="text" /><br />
            Enter Second Number: <input id="txt2" type="text" /><br />
            <input id="btn" type="button" value="Add Numbers" /><br />
            <input id="txt3" type="text" />
        </div>
    </form>
</body>
</html>
