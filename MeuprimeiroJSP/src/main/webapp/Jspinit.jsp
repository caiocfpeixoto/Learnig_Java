<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
	Hello World<br/>
	<% out.println("Seu endere�o de ip �: " + request.getRemoteAddr());%><br/>
	<%! 
		String frase;
		public void jspInit(){
			frase="Executando m�todo de inicializa��o";
		}
	%>
	<% out.println(frase); %>
</body>
</html>