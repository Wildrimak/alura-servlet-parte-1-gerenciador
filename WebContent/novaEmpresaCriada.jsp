<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String nomeEmpresa = (String) request.getAttribute("nomeDaEmpresa");
		String nomeEmpresaQueVeioDoForm = (String) request.getParameter("nome");
	%>
	<p>Empresa <%=nomeEmpresa%> cadastrada com sucesso! </p>
	<p>O que veio do form fora <%=nomeEmpresaQueVeioDoForm%></p>
	<a href="listaEmpresas">Listar empresas</a>
</body>
</html>