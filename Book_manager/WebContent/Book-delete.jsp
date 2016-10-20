<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>图书删除</title>
</head>
<body>
<center>
<h3>图书删除成功，请稍等！</h3>
<%response.setHeader("Refresh","2;URL=Book-list");%>  

</center>
</body>
</html>