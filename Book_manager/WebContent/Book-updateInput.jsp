<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>更新添加</title>
</head>
<body>
图书更新
<a href="Book-add">添加</a>
<form action="Book-updateInput" method="post">
  	ISBN:<input type="hidden" name="Book.ISBN" /><br/>
  	Tittle:<input name="Book.Tittle" /><br/>
  	AuthorID:<input name="Book.AuthorID"  /><br/>
  	Publisher:<input name="Book.Publisher" /><br/>
  	PublishDate:<input name="Book.PublishDate" /><br/>
  	Price:<input name="Book.Price" /><br/>
  	<input type="submit" value="update" /> <br/>
  </form>
</body>
</html>