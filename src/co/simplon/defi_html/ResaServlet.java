package co.simplon.defi_html;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.model.ResaAdmin;
import co.simplon.model.JdbcConnector;
import co.simplon.model.Resa;
import co.simplon.model.ResaImpl;

/**
 * Servlet implementation class ResaServlet
 */
@WebServlet("/ResaServlet")
public class ResaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResaServlet() {
        super();

    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		// Récupération des tickets actifs
		request.setAttribute("resas", ResaAdmin.getInstance().getResas().values());
		
		getServletContext().getRequestDispatcher("/listeResa.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Récupération des informations saisies par l'utilisateur
		String email = request.getParameter("email");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String tel = request.getParameter("tel");
		String password = request.getParameter("password");
		String sejour = request.getParameter("sejour");
		String region = request.getParameter("region");
		String nuitee = request.getParameter("nuitee");		
		int nbrNuit = Integer.parseInt(nuitee);
		
		
		String optionAnimal = request.getParameter("optionAnimal");
		//optionAnimal = "";
		if (optionAnimal == null) {
			optionAnimal = "non";
		} else {
			optionAnimal = "oui";
		}
		
		String optionForfait = request.getParameter("optionForfait");
		//optionForfait = "";
		if (optionForfait == null) {
			optionForfait = "non";
		} else {
			optionForfait = "oui";
		}
		
		String optionPatinoire = request.getParameter("optionPatinoire");
		//optionPatinoire = "";
		if (optionPatinoire == null) {
			optionPatinoire = "non";
		} else {
			optionPatinoire = "oui";
		}
		
		String optionLuge = request.getParameter("optionLuge");
		//optionLuge = "";
		if (optionLuge == null) {
			optionLuge = "non";
		} else {
			optionLuge = "oui";
		}

		
		PrintWriter out = response.getWriter();
		String dateDepart = "";
		String dateArrivee = "";
		Date dateD = null;
		Date dateA = null;
		
		JdbcConnector connect = new JdbcConnector(); // j'instancie ma classe de connexion
		try {
			connect.initConnect(); // j'appelle ma methode pour ouvrir ma connexion
		} catch (ClassNotFoundException | SQLException e1) {

			e1.printStackTrace();
		}
		
		
		
		try {
			// j'appelle ma methode pour importer la data user
			connect.insertDataUser(nom, prenom, email, tel, password, sejour, region, optionAnimal, optionForfait, optionPatinoire, optionLuge, dateD, dateA);
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		}
		
		// j'appelle la methode pour lire/voir les données 
		// connect.showDataUser()
		
		
		
		
		
		
		
		
		
		
		try{
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dateDepart = request.getParameter("dateDepart");
			dateD = sdf.parse(dateDepart);
			
		}
			
			
		 catch (ParseException e) {
			out.println("la date de départ est au mauvais format, retapez la date jj/mm/aaaa");
				e.printStackTrace();
			}
		
		
		try{
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dateArrivee = request.getParameter("dateArrivee");
			dateA = sdf.parse(dateArrivee);
		}
			
			
		 catch (java.text.ParseException e) {
			out.println("la date de départ est au mauvais format, retapez la date jj/mm/aaaa");
				e.printStackTrace();
			}
	
	
		
		// Vérification des informations saisies
		if((nom == null) || (nom.isEmpty()))
		{
			String message = "Le nom formulaire n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
		}
		else if((prenom == null) || (prenom.isEmpty()))
		{
			String message = "Le prenom du formulaire n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
		}
		else if((email == null) || (email.isEmpty()))
		{
			String message = "Le mail du formulaire n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
		}
		else if((tel == null) || (tel.isEmpty()))
		{
			String message = "Le numéro de téléphone n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
		}
		else if((password == null) || (password.isEmpty()))
		{
			String message = "Le mot de passe n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
		}
		else if((region == null) || (region.isEmpty()))
		{
			String message = "Vous n'avez pas sélectionné de région !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
			
		}
		else if((nuitee == null) || (nuitee.isEmpty()))
		{
			
			String message = "Vous n'avez pas sélectionné le nombre de nuit !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
			
		}
		else if((dateD == null))
		{
			
			String message = "Vous n'avez pas sélectionné votre date de départ !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
			
		}
		else if((dateA == null))
		{
			String message = "Vous n'avez pas sélectionné votre date d'arrivée !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);

		}
		else
		{
			boolean formulaireOK = true;
			
			// Tout est en règle => Création du nouveau ticket
			Resa newResa = new ResaImpl();
			newResa.setNom(nom);
			newResa.setPrenom(prenom);
			newResa.setEmail(email);
			newResa.setTel(tel);
			newResa.setPassword(password);
			newResa.setSejour(sejour);
			newResa.setRegion(region);
			newResa.setnbrNuit(nbrNuit);
			newResa.setOptionAnimal(optionAnimal);
			newResa.setOptionForfait(optionForfait);
			newResa.setOptionPatinoire(optionPatinoire);
			newResa.setOptionLuge(optionLuge);
			newResa.setDateD(dateD);
			newResa.setDateA(dateA);
			
			
			// Ajout du ticket à la liste des tickets déjà entrés
			try {
				ResaAdmin.getInstance().addResa(newResa);
			}
			catch (Exception e) {
				// Gestion des exceptions
				formulaireOK = false;
				request.setAttribute("message", e.getMessage());
				getServletContext().getRequestDispatcher("/erreurResa.jsp").forward(request, response);
			}
			
			if(formulaireOK)
			{
				// L'ajout du ticket s'est bien passé => Affichage de la page de récapitulation
				request.setAttribute("resa", newResa);
				getServletContext().getRequestDispatcher("/formulaireOK.jsp").forward(request, response);
			}	
		}
	}
}
 