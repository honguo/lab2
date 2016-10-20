<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>作者所著</title>
</head>
<body>
<center>
<h3>图书列表</h3>
<hr>
<table border=1 align=center bordercolor=#CCCCFF>
<tr bgcolor="#0099FF"><th colspan=9>作者所著图书</th></tr>
<tr>
<th width=100 align=center>ISBN</th>
<th width=100 align=center>Tittle</th>
<th width=100 align=center>AuthorID</th>
<th width=100 align=center>Publisher</th>
<th width=100 align=center>PublishDate</th>
<th width=100 align=center>Price</th>
<th width=100 align=center>删除</th>
<th width=100 align=center>查询</th>
</tr>
<s:iterator value="books" var="c">
<tr>
	<td align=center><s:property value="#c.ISBN"/> </td>
	<td align=center><s:property value="#c.Tittle"/> </td>
	<td align=center><s:property value="#c.AuthorID"/> </td>
	<td align=center><s:property value="#c.Publisher"/> </td>
	<td align=center><s:property value="#c.PublishDate"/></td>
	<td align=center><s:property value="#c.Price"/> </td>
	<td align=center><a href="Book-delete?ISBN=<s:property value="#c.ISBN"/>">删除Book</a> </td>
	<td align=center><a href="Author-query?AuthorID=<s:property value="#c.AuthorID"/>">查询作者</a></td>
	</tr>
</s:iterator>
</table>
<hr>
<a href="Book-list">返回图书列表</a>
</center>

</body>
</html>