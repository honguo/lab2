<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>图书添加</title>
</head>
<body>
<p>图书添加
 <form action="Book-add" method="post">
  	ISBN:<input name="book.ISBN" />
  	Tittle:<input name="book.Tittle"/>
  	Author:<input name="book.AuthorID" />
  	Publisher:<input name="book.Publisher" />
  	PublishDate:<input name="book.PublishDate" />
  	Price:<input name="book.Price" />
  	<input type="submit" value="add" /> 
  </form>
</body>
</html>