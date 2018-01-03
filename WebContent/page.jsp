<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="style2.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Bonjour ${pseud}
	</br> Liste des clients
	<table id="tabclient">
		<TH>Id</th>
		<TH>Nom</th>
		<c:forEach items="${listClients}" var="cl">
			<tr>
				<td><c:out value="${cl.iDClient}"  />
				<td>
				<td><c:out value="${cl.nomClient}" />
				<td>
				<td><c:out value="${cl.nomClient}" />
				<td>
				 <a href="https://www.${cl.nomClient}"/> <td>
			</tr>
		</c:forEach>
	</table>


Consultation solde : IdClient ?
		<form method="post" action="ClientSolde">
			IdClient: <input type="text" name="inputidcli" maxlength =10 Required ><br> 
            <input type="Submit" value="executer"> </br>
	   </form>

		<p class="intro">VIREMENT</p>
<form method="post" action="ClientVir">
Effectuer un virement
            <input type="Submit" value="exec"> </br>
	  
	   </form>
		
	</div>








</body>
</html>
</body>
</html>