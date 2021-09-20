<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados do Cliente</title>
</head>
<body>
	<form action="ServletLogin" method="post">
		Usuario: <input type="text" name="usuario">
		Senha: <input type="password" name="senha"><br>
		Sobrenome: <input type="text" name="sobrenome"><br>
		Rua: <input type="text" name="rua"><br>
		Complemento: <input type="text" name="complemento"><br>
		Cidade: <input type="text" name="cidade"><br>
		CEP: <input type="text" name="cep"><br>
		Estado: <input type="text" name="estado"><br>
		<input type="submit" value="Próxima tela">
	</form>
</body>
</html>