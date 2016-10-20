<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详细信息</title>
</head>
<body>
<center>
<h3>图书详细信息和作者详细信息</h3>
<hr>
<table border=1 align=center bordercolor=#CCCCFF>
<tr bgcolor="#0099FF"><th colspan=6>作者所著图书</th></tr>
<tr>
<th width=100 align=center>ISBN</th>
<th width=100 align=center>Tittle</th>
<th width=100 align=center>AuthorID</th>
<th width=100 align=center>Publisher</th>
<th width=100 align=center>PublishDate</th>
<th width=100 align=center>Price</th>
</tr>
<s:iterator value="books" var="c">
<tr>
	<td align=center><s:property value="#c.ISBN"/> </td>
	<td align=center><s:property value="#c.Tittle"/> </td>
	<td align=center><s:property value="#c.AuthorID"/> </td>
	<td align=center><s:property value="#c.Publisher"/> </td>
	<td align=center><s:property value="#c.PublishDate"/></td>
	<td align=center><s:property value="#c.Price"/> </td>
	</tr>
</s:iterator>
</table>

<table border=1 align=center bordercolor=#CCCCFF>
<tr bgcolor="#0099FF"><th colspan=4>详细信息</th></tr>
<tr>
<th width=100 align=center>AuthorID</th>
<th width=100 align=center>Name</th>
<th width=100 align=center>Age</th>
<th width=100 align=center>Country</th>
</tr>
<s:iterator value="authors" var="c">
<tr>
	<td align=center><s:property value="#c.AuthorID"/> </td>
	<td align=center><s:property value="#c.Name"/> </td>
	<td align=center><s:property value="#c.Age"/> </td>
	<td align=center><s:property value="#c.Country"/> </td>	
	</tr>
</s:iterator>
</table>
<hr>
<a href="Book-list">返回图书列表</a>
</center>

</body>
</html>