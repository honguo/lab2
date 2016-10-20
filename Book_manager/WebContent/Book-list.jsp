<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="/struts-tags" prefix="s" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书列表</title>
</head>
<body>
<center>
<h3>图书列表</h3>
<hr>
<table border=1 align=center bordercolor=#CCCCFF>
<tr bgcolor="#0099FF"><th colspan=9>用户图书列表</th></tr>
<tr>
<th width=100 align=center>ISBN</th>
<th width=100 align=center>Tittle</th>
<th width=100 align=center>AuthorID</th>
<th width=100 align=center>Publisher</th>
<th width=100 align=center>PublishDate</th>
<th width=100 align=center>Price</th>
<th width=100 align=center>删除</th>
<th width=100 align=center>更新</th>
<th width=100 align=center>查询</th>
</tr>
<s:iterator value="books" var="c">
<tr>
	<td align=center><s:property value="#c.ISBN"/> </td>
	<td align=center><a href="Book-detail?Tittle=<s:property value="#c.Tittle"/>"><s:property value="#c.Tittle"/> </a></td>
	<td align=center><s:property value="#c.AuthorID"/> </td>
	<td align=center><s:property value="#c.Publisher"/> </td>
	<td align=center><s:property value="#c.PublishDate"/></td>
	<td align=center><s:property value="#c.Price"/> </td>
	<td align=center><a href="Book-delete?ISBN=<s:property value="#c.ISBN"/>">删除Book</a> </td>
	<td align=center><a href="Book-updateInput?ISBN=<s:property value="#c.ISBN"/>">更新Book</a></td>
	<td align=center><a href="Author-query?AuthorID=<s:property value="#c.AuthorID"/>">查询作者</a></td>
	</tr>
</s:iterator>
</table>
<hr>
<form action="Book-search" method="get">
<table border="0" align="center">
<tr>
<td>请输入要查询的作者名字：</td>
<td><input type="text" name="Name"></td>
<td><input type="submit" value="提交"></td>
</tr>

</table>
</form>
</center>


</body>
</html>