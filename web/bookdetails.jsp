<html>
<head><title>Duke's Bookstore</title></head>
<%@ page import="model.*" %>
<%
    BooksEntity book = (BooksEntity)request.getAttribute("book");
%>
<body bgcolor="#ffffff">
<center>
    <hr>
    <br> &nbsp;<h1><font size="+3" color="#CC0066">Duke's </font> <img src="./duke.books.gif" alt="Duke holding books">
    <font size="+3" color="black">Bookstore</font></h1>
    <br> &nbsp;
    <hr>
</center>

<h2><%= book.getTitle() %></h2>&nbsp; by<em> <%= book.getFirstName() + " " + book.getSurname() %> </em> (<%= book.getCalendarYear() %>)<br> <br>
<h4>Here's what the critcs say: </h4>
<blockquote><%= book.getDescription() %></blockquote>
<h4>Our Price: <%= book.getPrice() %></h4>

<p><strong><a href="./bookcatalog?bookId=<%= book.getId() %>">Add to Cart</a> <a href="./bookcatalog">Continue Shopping</a></strong></p>
</body>
</html>