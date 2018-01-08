package co.simplon.model;

import java.util.Date;

public interface Resa {
	
	public String getNom();
	public void setNom(String nom);
	
	public String getPrenom();
	public void setPrenom(String prenom);
	
	public String getTel();
	public void setTel(String tel);
	
	public String getEmail();
	public void setEmail(String email);
	
	public String getPassword();
	public void setPassword(String password);
	
	public Date getDateEnregistrement();
	public void setDateEnregistrement(Date date);
	
	public String getSejour();
	public void setSejour(String sejour);
	
	public String getRegion();
	public void setRegion(String region);
	
	public int getnbrNuit();
	public void setnbrNuit(int nbrNuit);
	
	public Date getDateD();
	public void setDateD(Date dateD);
	
	public Date getDateA();
	public void setDateA(Date dateA);
	
	public String getOptionAnimal();
	public void setOptionAnimal(String optionAnimal);
	public String getOptionForfait();
	public void setOptionForfait(String optionForfait);
	public String getOptionPatinoire();
	public void setOptionPatinoire(String optionPatinoire);
	public String getOptionLuge();
	public void setOptionLuge(String optionLuge);
	
//	public String AnimalAsString();
//	public String PatinoireAsString();
//	public String ForfaitasString();
//	public String LugeAsString();
//		
	

	
	
	
}
