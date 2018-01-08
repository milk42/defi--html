<%@page import="co.simplon.model.Resa"%>
<%@page import="co.simplon.model.ResaImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bien enregistré</title>
<!-- logo onglet -->
        <link rel="shortcut icon" href="image/logo-transpar.png" type="image/x-icon" />
<link rel="stylesheet" type="text/css" href="css/style.css">

		<!-- footer social -->
		<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">   
		<!--Font-->
		<link rel="stylesheet" href="https://formden.com/static/cdn/font-awesome/4.4.0/css/font-awesome.min.css" />
		
		
		  <!--Feuille de style perso-->
        <link rel="stylesheet" href="css/style.css">
</head>


<body style="text-align:center;">
		<% Resa resa = (Resa) request.getAttribute("resa"); %>
		<h1>Félicitation</h1>
		<p>Votre réservation a été enregistré à <%=resa.getDateEnregistrement()%> avec les informations suivantes :</p>
		<table class="resultTable">
		<thead>
		    <tr>
		      <th>Nom</th>
		      <th>Prenom</th>
		      <th>Email</th>
		      <th>Téléphone</th>
		      <th>Mot de passe</th>
		      <th>Type de séjour</th>
		      <th>Région choisie</th>
		      <th>OptionAnimal</th>
		      <th>OptionForfait</th>
		      <th>OptionPatinoire</th>
		      <th>OptionLuge</th>
		      <th>Date de départ</th>
		      <th>Date d'arrivée</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		    <td><%=resa.getNom()%></td>
		    <td><%=resa.getPrenom()%></td>
		    <td><%=resa.getEmail()%></td>
		    <td><%=resa.getTel()%></td>
		    <td><%=resa.getPassword()%></td>
		    <td><%=resa.getSejour()%></td>
		    <td><%=resa.getRegion()%></td>
		    <%-- <td><ul class="liste" style= "list-style-type:none">
						<li><%=resa.AnimalAsString()%></li>
						<li><%=resa.ForfaitasString()%></li>
						<li><%=resa.PatinoireAsString()%></li>
						<li><%=resa.LugeAsString()%></li>
						</ul></td> --%>
			<td><%=resa.getOptionAnimal()%></td>
			<td><%=resa.getOptionForfait()%></td>
			<td><%=resa.getOptionPatinoire()%></td>
			<td><%=resa.getOptionLuge()%></td>
			<td><%= request.getParameter("dateDepart") %></td>
			<td><%= request.getParameter("dateArrivee") %></td>
			</tr>
			</tbody>
			
    
   
			<%-- <tr>
				<th>Email</th>
				<td><%=resa.getEmail()%></td>
			</tr>
			<tr>
				<th>Nom</th>
				<td><%=resa.getNom()%></td>
			</tr>
			<tr>
				<td>Prénom</td>
				<td><%=resa.getPrenom()%></td>
			</tr>
			<tr>
				<td>Téléphone</td>
				<td><%=resa.getTel()%></td>
			</tr>
			<tr>
				<td>Mot de passe</td>
				<td><%=resa.getPassword()%></td>
			</tr>
			<tr>
				<td>Type de séjour</td>
				<td><%=resa.getSejour()%></td>
			</tr>
			<tr>
				<td>Région choisie</td>
				<td><%=resa.getRegion()%></td>
			</tr>
			<tr>
				<td>Nombre de nuit</td>
				<td><%=resa.getnbrNuit()%></td>
			</tr>
			<tr>
				<td>Date de départ</td>
				<td><%=resa.getDateD()%></td>
				<td>Date Départ : <%= request.getParameter("dateDepart") %></td>
			</tr>
			<tr>
				<td>Date de d'arrivée</td>
				<td><%=resa.getDateA()%></td>
			</tr>
			<tr>
				<td>Choix option(s) </td>
				<td><ul class="liste" style= "list-style-type:none">
				<li><%=resa.AnimalAsString()%></li>
				<li><%=resa.ForfaitasString()%></li>
				<li><%=resa.PatinoireAsString()%></li>
				<li><%=resa.LugeAsString()%></li>
				</ul></td>
			</tr>
			 --%>
			 
			 <footer>
        
			        <div class="footer-top"> 
			           <div class="form-inline">
			             <div class="col-lg-2 col-xs-12 text-center">
			                 <a href="#"><i class="fa fa-facebook fa-2x"></i>Facebook</a>
			             </div>
			              <div class="col-lg-2 col-xs-12 text-center">
			                 <a href="#"><i class="fa fa-twitter fa-2x"></i>Twitter</a>
			             </div>
			              <div class="col-lg-2 col-xs-12 text-center">
			                 <a href="#"><i class="fa fa-google-plus fa-2x"></i>Google</a>
			             </div>
			             <div class="col-lg-2 col-xs-12 text-center">
			                 <a href="#"><i class="fa fa-users"></i>Forum</a>
			             </div>
			              <div class="col-lg-2 col-xs-12 text-center">
			                 <a href="#"><i class="fa fa-map-marker"></i>Plan</a>
			             </div>
			             <div class="col-lg-2 col-xs-12 text-center">
			                 <a href="#"><i class="fa fa-wheelchair"></i>Accès</a>
			             </div>
			           </div> 
			        </div>  
			        
			        <div class="container" style="border-top:1px solid grey;">
			            <div class="row text-center">   
			                <div class="col-lg-6 col-lg-offset-3">
			                      <ul class="menu">
			                                 
			                             <li>
			                                <a href="#">Acceuil</a>
			                              </li>
			                                   
			                              <li>
			                                 <a href="#">Région</a>
			                              </li>
			                            			                                   
			                              <li>
			                                 <a href="#">Chalet</a>
			                              </li>
			                                   
			                              <li>
			                                <a href="#">Réservation</a>
			                             </li>

			                        </ul>		                      
			                </div>
			               <a href="#haut-de-page" class="hautPage" >Haut de Page <i class="fa fa-level-up"></i></a>
			            </div>            
			        </div>
        
    </footer>
    
    
					 <div class="copyright">
					     <div class="container">					       
					         <div class="row text-center">
					         	<p>Copyright © 2017 All rights reserved</p>
					         </div>	
					     </div>		         
			 	     </div>
   
		
			
		</table>
		<a href="index.html" >Retour</a>
	</body>
</html>