<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="linkListarEmpresas" value="/listarEmpresas" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar nova empresa</title>
</head>

<body>
	<p>Eu estou sendo o que era pra mim estar sendo?</p>

	<form action="linkListarEmpresas" method="post">
		Nome: <input type="text" name="nome">
		<input type="submit">
	</form>

</body>
</html>