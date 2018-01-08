package co.simplon.model;

//import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ResaAdmin {
	
	private final static ResaAdmin INSTANCE = new ResaAdmin();
	private final Map<String, Resa> resas = new HashMap<String, Resa>();
	
	private ResaAdmin(){
	}
	
	public static ResaAdmin getInstance() {
		return INSTANCE;
	}
	
	public Map<String, Resa> getResas(){
		return resas;
	}
	
	public void addResa (Resa resa) throws Exception{
		if(resas.containsKey(resa.getEmail()))
			throw new Exception("Vous ne pouvez pas enregistré deux réservations depuis le même email !");
		
		//resa.setDateEnregistrement(new Date());
		resas.put(resa.getEmail(), resa);
	}

}
