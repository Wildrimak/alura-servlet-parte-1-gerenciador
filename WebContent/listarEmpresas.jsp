<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresas cadastradas</title>
</head>
<body>
	<%
		List<Empresa> empresas = (List<Empresa>) request.getAttribute("listaEmpresas");
	%>
	<ul>
		<%
			for (Empresa empresa : empresas) {
				out.println("<li>" + empresa.getNome() + "</li>");
			}
		%>
	</ul>
	<a href="formNovaEmpresa.html">Cadastrar nova empresa</a>
</body>
</html>