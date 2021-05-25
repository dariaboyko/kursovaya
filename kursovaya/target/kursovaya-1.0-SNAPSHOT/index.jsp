<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
<div id="header"><h1>EXCHANGE RATES</h1></div>
<div id="sidebar">
    <p><a href="table.jsp">euro currency exchange rates</a></p>
    <p><a href="adminLogin.jsp">admin`s cabinet</a></p>
</div>
<div id="content">
    <h2>Exchange rate</h2>
    <p>Exchange rate is the value of one currency for the purpose of
        conversion to another. It is also regarded as the value of one
        country's currency in relation to another currency.</p>
</div>
</body>
</html>