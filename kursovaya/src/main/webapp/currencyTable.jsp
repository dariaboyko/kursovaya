<%@ page import="com.example.kursovaya.Data" %>
<%@ page import="com.example.kursovaya.Currency" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>mcdashaboyko</title>
    <style type="text/css">
        body { margin: 0; }
        #sidebar, #content { position: absolute; }
        #sidebar, #content { overflow: auto; padding: 10px; }
        #header {
            height: 80px;
            background: #FEDFC0; border-bottom: 2px solid #7B5427;
        }
        #header h1 { padding: 20px; margin: 0; }
        #sidebar {
            width: 150px; background: #ECF5E4; border-right: 1px solid #231F20;
            top: 82px;
            bottom: 0;
        }
        #content {
            top: 82px;
            left: 250px;
            bottom: 0; right: 0;
        }
    </style>
</head>
<body>
<div id="header"><h1>EXCHANGE RATES</h1></div>
<div id="sidebar">
    <p><a href="index.jsp">main page</a></p>
    <p><a href="adminLogin.jsp">admin`s cabinet</a></p>

</div>
<div id="content">
    <%=new java.util.Date()%>


    <br>
    <table border="3">
        <tr>
            <td>$----Currency Name----$</td>
            <td>$Exchange Rate = 1 EUR$</td>
            <td>$--------Date--------$</td>
        </tr>
        <%
            Data data =new Data();
            try {

                Set<Currency> list = data.getFoundCurrencies();
                for (Currency cur : list) {
        %>
        <tr>
            <td> <%= cur.getName() %> </td>
            <td> <%= cur.getValue().get(0).getValue()%> </td>
            <td> <%= cur.getDate().get(0).getDate() %> </td>
        </tr>

        <%
                }} catch (Exception e) {
                e.printStackTrace();
            }
        %>

    </table>
    <form action="RemoveFoundCurrencyServlet" method="get" >
        <input class="button" type="submit" value="clear the search">

    </form>
</div>
</body>
</html>