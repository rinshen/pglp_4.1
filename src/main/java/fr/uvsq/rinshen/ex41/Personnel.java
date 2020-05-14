package fr.uvsq.rinshen.ex41;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

public final class Personnel
{
    private final String nom;
    private final String prenom;
    private final String fonction;
    private final LocalDate dateNaissance;
    private final ArrayList<String> numTelephone;
    
    public static class Builder{
    	private String nom;
        private String prenom;
        private String fonction;
        private LocalDate dateNaissance;
        private ArrayList<String> numTelephone;
        
        public Builder(String Nom, String Prenom) {
        	nom=Nom;
        	prenom=Prenom;
        	
        	fonction="non spécifiée";
        	dateNaissance=LocalDate.of(0, Month.JANUARY, 1);
        	numTelephone=new ArrayList<String>();
        }
    	
        public Builder fonction(String Fonction) {
        	fonction=Fonction;
        	return this;
        }
        
        public Builder dateNaissance(int jour, Month mois, int annee) {
        	dateNaissance=LocalDate.of(annee, mois, jour);
        	return this;
        }
        
        public Builder numTelephone(String numero) {
        	numTelephone.add(numero);
        	return this;
        }
        
        public Personnel build() {
        	return new Personnel(this);
        }
    }
    
    public Personnel(Builder builder) {
    	nom=builder.nom;
    	prenom=builder.prenom;
    	fonction=builder.fonction;
    	dateNaissance=builder.dateNaissance;
    	numTelephone=builder.numTelephone;
    }

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public ArrayList<String> getNumTelephone() {
		return numTelephone;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Personnel)) {
			return false;
		}
		Personnel test = (Personnel)obj;
		if (!this.numTelephone.equals(test.getNumTelephone())) {
			return false;
		}
		if (!this.nom.equals(test.getNom())) {
			return false;
		}
		if (!this.prenom.equals(test.getPrenom())) {
			return false;
		}
		if (!this.fonction.equals(test.getFonction())) {
			return false;
		}
		if (!this.dateNaissance.equals(test.getDateNaissance())) {
			return false;
		}
		return true;
	}
}
