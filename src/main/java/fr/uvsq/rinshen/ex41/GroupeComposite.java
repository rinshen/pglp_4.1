package fr.uvsq.rinshen.ex41;

import java.util.ArrayList;

public class GroupeComposite extends Groupe {
	private ArrayList<Groupe> sousGroupes;
	
	public GroupeComposite() {
		super();
		sousGroupes = new ArrayList<Groupe>();
	}
	
	public void ajouteGroupe(Groupe groupe) {
		sousGroupes.add(groupe);
	}
	
	public ArrayList<Groupe> getSousGroupes() {
		return sousGroupes;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof GroupeComposite)) {
			return false;
		}
		GroupeComposite test = (GroupeComposite)obj;
		if (!this.getMembres().equals(test.getMembres())) {
			return false;
		}
		if (!this.sousGroupes.equals(test.sousGroupes)) {
			return false;
		}
		return true;
	}
}
