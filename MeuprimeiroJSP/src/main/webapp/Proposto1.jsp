<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Day</title>
</head>
<body>
 	<%
    GregorianCalendar calendar = new GregorianCalendar();
    Date date1 = new Date();
    calendar.setTime(date1);
	SimpleDateFormat sdf= new SimpleDateFormat("EEEEE");
 	out.println("Hoje é " + sdf.format(date1));
 	%>
</body>
</html>