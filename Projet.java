//Projet.java
package time;

import java.util.ArrayList;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;
 
//@objid ("d7aea011-9cee-4147-8142-dfb1106e3f07")
public class Projet {
   // @objid ("27bbc2b4-8df8-4c77-b068-67f78bd0c1e5")
    public int id;
 
    //@objid ("f81170f9-27b3-43f3-ab0c-7cc1497f7271")
    public String nom;
 
    //@objid ("9f52f249-6d99-4dea-b034-4f34858be7d9")
    public ArrayList<Activité> activité ; 
 
    public Projet(String nom) {
    	this.id = 0;
    	this.nom = nom;
    	this.activité = new ArrayList<Activité> ();
    	
        //creation de nos activités/disciplines
    	Activité activité1 = new Activité("design1");
        Activité activité2 = new Activité("design2");
        Activité activité3 = new Activité("implementation");
        Activité activité4 = new Activité("test");
        Activité activité5 = new Activité("deploiement");
        
        //On ajoute nos activités à notre projet
        this.ajouterActivité(activité1);
        this.ajouterActivité(activité2);
        this.ajouterActivité(activité3);
        this.ajouterActivité(activité4);
        this.ajouterActivité(activité5);
    }
    
    public String getProjet() {
    	return this.nom;
    }
    
    //@objid ("ed883180-82bb-4aaf-8a2f-3c18f4259dd9")
    public void ajouterActivité(Activité activity) {
    	this.activité.add(activity);
    }
    
 
}