<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="CalculatorClient.aspx.cs" Inherits="WebApplicationClient.CalculatorClient" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            Calculator API</div>
        <asp:TextBox ID="firstNumber" runat="server"></asp:TextBox>
        <asp:TextBox ID="secondNumber" runat="server"></asp:TextBox>
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" style="height: 26px" Text="Add" />
        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Sub" />
        <asp:Button ID="Button3" runat="server" OnClick="Button3_Click" Text="Mul" />
        <asp:Button ID="Button4" runat="server" OnClick="Button4_Click" Text="div" />
        <asp:Label ID="res" runat="server" Text="Label"></asp:Label>
    </form>
</body>
</html>
