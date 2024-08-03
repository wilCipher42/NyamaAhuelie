//Timelog.java 
package time;

import java.util.Date;
import java.time.LocalDateTime;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;

//@objid ("7d77e926-eb71-4647-8508-b2dfa21926a0")
public class Timelog {
	
	//public Activité activité;
   
    //@objid ("8f44d020-393f-498a-bcef-11cec3e3900f")
    public String enregistrerDebutActivité(Activité activité) {
    	
    	if (activité.start == true)
    		return activité.getActivité()+" commencé à: "+activité.dateD;
    	else
    		return "Pas d'activité";
    		
    }
 
    //@objid ("8da8f006-0b7c-4af5-830a-8d4d9c765804")
    public String enregistreFinActivité(Activité activité) {
    	if (activité.end == true)
    		return activité.getActivité()+" terminée à: "+activité.dateF;
    	else
    		return "Pas d'activité";
    }
    
    public String seConnecter() {
    	return "Entrez votre nom et votre ID (sans espaces): ";
    }
 
}