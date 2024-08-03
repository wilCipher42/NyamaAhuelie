//Employé.java
package time;

import java.util.ArrayList;
import java.util.List;
//import com.modeliosoft.modelio.javadesigner.annotations.DataType;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;
 
//@objid ("b3c12a5d-1aa8-453b-bf7c-73fb69500e24")
public class Employé {
    //@objid ("d1530482-c232-41fd-af1e-7b49c2fbbfa4")
    public int id ;
 
    //@objid ("95c89a41-f919-49e1-9869-a52a951fbc3e")
    public String nom;
 
    //@objid ("1414f711-e2f9-4c31-bccd-ae08a5eb6308")
    public int nas;
 
    //@objid ("dead37a6-53f7-4544-bfbf-2fe32e2dd1c7")
    public String poste;
    
    public Projet project;
 
    //@objid ("8e73203d-ff74-41b8-9897-b1b893c04f98")
    public List<Activité> activité = new ArrayList<Activité> ();
 
   // @objid ("a87cdaf4-fdee-4239-99ba-fdde041a940c")
    public Timelog timelog;
 
    //@objid ("58446756-4250-4f45-9659-6e5c746bf4b1")
    public List<Projet> projet = new ArrayList<Projet> ();
    
    public Employé(String nom, int iD, Projet project) {
    	this.nom = nom;
    	this.id = iD;
    	this.nas = 0;
    	this.project = project;
    }
    
    public String getEmployé() {
    	
    	return this.nom+this.id;
    }
  
}