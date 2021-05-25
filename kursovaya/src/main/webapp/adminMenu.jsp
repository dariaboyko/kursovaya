<%--
  Created by IntelliJ IDEA.
  User: daria
  Date: 01.05.2021
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
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
            left: 170px;
            bottom: 0; right: 0;
        }
    </style>
</head>
<body>
<div id="header"><h1>ADMIN`S CABINET</h1></div>
<div id="sidebar">
    <p><a href="adminTable.jsp">euro currency exchange rates</a></p>
    <p><a href="currency.jsp">editing</a></p>
    <p><a href="LogOut.jsp">quit</a>
    </p>


</div>
<div id="content">
    <h2>Hi admin!</h2>
    <p>hi admin!</p>
</div>

</body>
</html>
