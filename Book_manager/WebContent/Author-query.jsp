<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>作者信息</title>
</head>
<body>
<center>
<h3>作者信息</h3>
<hr>
<table border=1 align=center bordercolor=#CCCCFF>
<tr bgcolor="#0099FF"><th colspan=5>详细信息</th></tr>
<tr>
<th width=100 align=center>AuthorID</th>
<th width=100 align=center>Name</th>
<th width=100 align=center>Age</th>
<th width=100 align=center>Country</th>
<th width=100 align=center>查询</th>
</tr>
<s:iterator value="authors" var="c">
<tr>
	<td align=center><s:property value="#c.AuthorID"/> </td>
	<td align=center><s:property value="#c.Name"/> </td>
	<td align=center><s:property value="#c.Age"/> </td>
	<td align=center><s:property value="#c.Country"/> </td>	
	<td align=center><a href="Book-query?AuthorID=<s:property value="#c.AuthorID"/>">作品查询</a> </td>	
	</tr>
</s:iterator>
</table>
<hr>
<a href="Book-list">返回图书列表</a>
</center>

<form action="Book-search" method="get">
<table border="0" align="center">
<tr>
<td>请输入要查询的作者名字：</td>
<td><input type="text" name="Name"></td>
<td><input type="submit" value="提交"></td>
</tr>

</table>
</form>

</body>
</html>