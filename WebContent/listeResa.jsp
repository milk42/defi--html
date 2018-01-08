<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="co.simplon.model.Resa"%>
<%@page import="co.simplon.model.ResaImpl"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
		<title>Admin Resa</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body style="text-align:center;">
		<h1>Liste des réservations du chalet</h1>
		
			
		<table>
		<tr>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Email</th>
			<th>Mot de passe</th>
		</tr>
		<%
			SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Collection<Resa> listeResas = (Collection<Resa>) request.getAttribute("resas");
			if(listeResas != null){
				Iterator it = listeResas.iterator() ;
			    while (it.hasNext()){
			    	Resa serveur=(Resa) it.next() ;
		%>
					<tr>
						<td><%=serveur.getNom()%></td>
						<td><%=serveur.getPrenom()%></td>
						<td><%=serveur.getEmail()%></td>
						<td><%=serveur.getPassword()%></td>
						
						
						<!-- <td><%=dateFormater.format(serveur.getDateEnregistrement())%></td> -->
					</tr>
		<%      }
			}
		%>
		</table>
		<a href="index.html" >Retour</a>
	</body>
</html>