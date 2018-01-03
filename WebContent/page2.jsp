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
<title>Consultation du solde</title>
<h2>Consultation du solde pour le Client no <c:out value="${idclient}"  /> :
<c:out value="${soldeclient}"  />  </h2>
</br>
<h3>Retour page principale</h3>
</br>
<form method="post" action="BankServlet">
	</br> <input type="Submit" value="RETOUR"> </br>
</form>
</body>
</html>