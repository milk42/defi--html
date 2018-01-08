package co.simplon.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JdbcConnector {
	// variable(constantes) de connexion
	private final static String BDPATH = "jdbc:mysql://localhost:3306/mydb"; // ou 8081
	private final static String DBUSER = "admin";
	private final static String DBPASSWORD = "admin";
	
	private Connection connection = null;
	
	public void initConnect() throws SQLException, ClassNotFoundException {
		// fonction pour se connecter à ma base
		
		if(connection == null) {
			// Load the database driver
			Class.forName("com.mysql.jdbc.Driver");
						
			// Create the jdbc connection, initialise la connexion
			connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
			System.out.println("connexion OK");
		}		
	}
	
	//insert // lecture  
	
	public void insertDataUser(String nom, String prenom, String email, String telephone, String password, String typeSejour, String region, String optionAnimal, String optionForfait, String optionPatinoire, String optionLuge, Date dateD, Date dateA)  throws SQLException {
		
		Statement statement = null; //variable de déclaration initialisée à null

		try {
			// ouvre la connexion
			statement = connection.createStatement();
			// j'initialise une requête avec mes paramètres à récupérés
			 
			String sql = "INSERT INTO `reservation` (`nom`, `prenom`, `email`, `telephone`, `password`, `typeSejour`, `region`, `optionAnimal`,`optionForfait`, `optionPatinoire`, `optionLuge`, `dateD`, `dateA`) VALUES ('" + nom + "', '" + prenom + "', '" + email + "', '" + telephone + "', '" + password + "', '" + typeSejour + "', '" + region + "', '" + optionAnimal + "', '" + optionForfait + "', '" + optionPatinoire + "', '" + optionLuge + "', '" + dateD + "', '" + dateA + "')";
			statement.executeUpdate(sql);
		}
		catch(SQLException e){
			System.out.println("An error occured trying to insert the new data !");
		}
		finally{	 
			statement.close();
		}
	
	}
	
	
	public void showDataUser() throws SQLException {
		
		Statement statement = null;
		ResultSet rs = null;// retour des infos

		try {
			// Create the statement
			statement = connection.createStatement();
			String sql = "SELECT * FROM reservation";
			
			// Execute the query
			rs = statement.executeQuery(sql);// retourne moi ma requête dans rs.
		
			// Loop on the results extracted from the database
			//System.out.println("Liste actuelle des réservations :");
			// vient me placer les infos user dans les colonnes correspondantes
			while (rs.next()) {
				System.out.println("  - " + rs.getString("id_reservation") + " : " + rs.getString("prenom") + " " +  rs.getString("nom") + " " +  rs.getString("email") + " " +  rs.getString("telephone") + " " +  rs.getString("password") + " " +  rs.getString("typeSejour") + " " +  rs.getString("region") + " " +  rs.getString("optionAnimal") + "  " +  rs.getString("optionForfait") + "  " +  rs.getString("optionPatinoire") + "  " +  rs.getString("optionLuge") + " " +  rs.getString("dateD") + " " +  rs.getString("dateA"));
					
			
			}
		}
		catch(SQLException e){
			System.out.println("An error occured trying to read the data !");
		}
		finally{	 
			statement.close();
		}
	}
}
