<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" type="text/css" href="style3.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style3.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Website General LayOut</title>

<div id="header">
	<h1>PROXIBANQUE SI</h1>

</div>

</head>
<body background="blue.jpg">
<body>



	<form method="post" action="ClientVir">
		<div id="formulaire">
			<fieldset>
				montant : <input type="text" name="montant" maxlength=10 Required><br>
			</fieldset>
		</div>
		<fieldset>
			<select name="origine" size="1">
				<c:forEach items="${listClients}" var="cl">
					<option value="${cl.iDClient}">${cl.nomClient}</option>
				</c:forEach>
			</select> <img src="fleche.gif"> <select name="destinataire" size="1">
				<c:forEach items="${listClients}" var="cl">
					<option value="${cl.iDClient}">${cl.nomClient}</option>
				</c:forEach>
			</select> </br> <input type="Submit" value="executer"> </br>

			<fieldset>
	</form>
	<form method="post" action="BankServlet">
		</br> <input type="Submit" value="ANNULER"> </br>
	</form>
</body>
</html>