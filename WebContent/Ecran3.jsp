<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style3.css">

<div id="header">
	<h1>PROXIBANQUE SI</h1>
	<h2>Le Futur de la Banque Moderne</h2><br/><br/><br/><br/>
</div>
<style>
table {
    width:100%;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;
}
table#t01 tr:nth-child(even) {
    background-color: #eee;
}
table#t01 tr:nth-child(odd) {
   background-color:#fff;
}
table#t01 th {
    background-color: black;
    color: white;
}
</style>
</head>
<body background="blue.jpg">


<H2>Bonjour ${pseud}</H2>

<p><h2>Liste des Client</h2>





<table id="t01">
  
    <TH>Id</th>
	<TH>Nom</th>
	<th>Prenom</th>
   	<th>Adresse</th>
	<th>Email</th>
	<th>Compte Courant</th>
	<c:forEach items="${listClients}" var="cl">
			<tr>
				<td><c:out value="${cl.iDClient}"  />
				<td><c:out value="${cl.nomClient}" />
				<td><c:out value="${cl.prenomClient}" />
				<td><c:out value="${cl.adresseClient}" />
				<td><c:out value="${cl.emailClient}" />
				<td><a href="ClientSolde?idclient=${cl.iDClient}" class="btn btn-info" role="button">consulter solde</a></td>
			</tr>
		</c:forEach>
   
</table>
</br></br></br>
<H2>Consultation solde : </H2>
		<form method="post" action="ClientSolde">
	<H3>IdClient = <input type="text" name="inputidcli" maxlength =10 Required > ?</H3><br> </br>
           <input type="Submit" value="executer"> </br>
	   </form>
</br>
<form method="post" action="ClientVir">
<H2>Effectuer un virement</H2>
            <input type="Submit" value="exec"> </br>
	  
	   </form>
			

</body>
</html>
