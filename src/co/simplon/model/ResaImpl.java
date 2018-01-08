package co.simplon.model;

import java.util.Date;

public class ResaImpl implements Resa{
	
	
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private Date dateEnregistrement;
	private String password;
	private String sejour;
	private String region;
	private int nbrNuit;
	private String optionAnimal;
	private String optionForfait;
	private String optionPatinoire;
	private String optionLuge;
	private Date dateD;
	private Date dateA;
	
	
	
	
	public Date getDateA() {
		return dateA;
	}
	public void setDateA(Date dateA) {
		this.dateA = dateA;
	}
	public Date getDateD() {
		return dateD;
	}
	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}

	public String getOptionAnimal() {
		return optionAnimal;
	}
	public void setOptionAnimal(String optionAnimal) {
		this.optionAnimal = optionAnimal;
	}
	public String getOptionForfait() {
		return optionForfait;
	}
	public void setOptionForfait(String optionForfait) {
		this.optionForfait = optionForfait;
	}
	public String getOptionPatinoire() {
		return optionPatinoire;
	}
	
	public void setOptionPatinoire(String optionPatinoire) {
		this.optionPatinoire = optionPatinoire;
	}
	public String getOptionLuge() {
		return optionLuge;
	}
	public void setOptionLuge(String optionLuge) {
		 this.optionLuge = optionLuge;
	}
		 
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
	
	public String getSejour() {
		return sejour;
	}
	public void setSejour(String sejour) {
		this.sejour = sejour;
	}

	public int getnbrNuit() {
		return nbrNuit;
	}
	public void setnbrNuit(int nbrNuit) {
		this.nbrNuit = nbrNuit;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDateEnregistrement()
	{
		return dateEnregistrement;
	}
	
	public void setDateEnregistrement(Date date)
	{
		this.dateEnregistrement = date;
	}
}
	
	
//	public String AnimalAsString() {
//		String result = "";
//		if(this.Option1) {
//			result = "Animal de compagnie";
//		}
//		return result;
//	}
//	public String PatinoireAsString() {
//		String result = "";
//		if(this.Option3) {
//			result = "Ticket Patinoire Olympique";
//		}
//		return result;
//	}
//	public String ForfaitasString() {
//		String result = "";
//		if(this.Option2) {
//			result = "Forfait";
//		}
//		return result;
//	}
//	public String LugeAsString() {
//		String result = "";
//		if(this.Option4) {
//			result = "Réservation luge";
//		}
//		return result;
//	}
//}
