//Activité.java
package time;

import java.time.LocalDateTime;
//import com.modeliosoft.modelio.javadesigner.annotations.DataType;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;
 
//@objid ("d9c28da5-3fa5-4843-aad9-2eae34eb780b")
public class Activité {
    
    //@objid ("32e1ac82-fa03-427a-ac9a-6734ffe9a9fa")
    public String nom;
    public boolean start;
    public boolean end;
    public LocalDateTime dateD;
    public LocalDateTime dateF;
 
    
    public Activité(String nom) {
    	this.nom = nom;
    	this.start = false;
    	this.end = false;
    }
 
    public String getActivité() {
    	return this.nom;
    }
    
    //@objid ("8e8595eb-aa1c-4759-9718-eeacd3a2b1af")
    public String debuter() {
    	this.start = true;
    	this.dateD = LocalDateTime.now();   //retourne date de debut
    	return this.nom+" débuté";
    }
    
 
    //@objid ("e1423745-67d5-498b-8062-bfeefd39b3ec")
    public String terminer() {
    	this.end = true;
    	this.dateF = LocalDateTime.now();   //retourner la date de fin
    	return this.nom+" terminé";
    	
    }
 
}