<%@ page import="java.util.List" %>
<%@ page import="com.example.kursovaya.Data" %>
<%@ page import="java.util.Set" %>
<%@ page import="com.example.kursovaya.Data" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            left: 170px;
            bottom: 0; right: 0;
        }
    </style>
</head>
<body>

<div id="header"><h1>ADD VALUE AND DATE</h1></div>
<div id="sidebar">
    <p><a href="adminTable.jsp">euro currency exchange rates</a></p>
    <p><a href="adminMenu.jsp">admin`s cabinet</a></p>
    <p><a href="currency.jsp">currencies</a></p>
    <p><a href="LogOut.jsp">quit</a>
    </p>


</div>

<div id="content">
    <c:if test="${error != null}">
        <p style="color:red"><c:out value="${error}" /></p>
    </c:if>

    <form action="AddValueServlet" method="post">
        Value: <input type="number" name = "value" value="">
        <input type="submit" value="Add value"/>
        <input type="hidden" name="Id" value="${param.Id}">
    </form>



    <ul>
        <c:forEach var="v" items="${value}">
            <a><c:out value="${v.getValue()}" /></a>
            <form action="RemoveValueServlet" method="post">
                <input type="hidden" name="valueId" value="${v.getId()}">
                <input type="hidden" name="Id" value="${param.Id}">
                <input type="submit" value="remove">
            </form>

        </c:forEach>
    </ul>
    <form action="AddDateServlet" method="post">
        Date: <input type="text" name = "date" value="">
        <input type="submit" value="Add date"/>
        <input type="hidden" name="Id" value="${param.Id}">
    </form>
    <ul>
        <c:forEach var="d" items="${date}">
            <a><c:out value="${d.getDate()}" /></a>

            <form action="RemoveDateServlet" method="post">
                <input type="hidden" name="dateId" value="${d.getId()}">
                <input type="hidden" name="Id" value="${param.Id}">

                <input type="submit" value="remove">
            </form>


        </c:forEach>
    </ul>
</div>


</body>
</html>