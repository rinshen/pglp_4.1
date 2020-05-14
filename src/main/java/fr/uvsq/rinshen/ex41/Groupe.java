package fr.uvsq.rinshen.ex41;

import java.util.ArrayList;

import fr.uvsq.rinshen.ex41.Personnel;

public abstract class Groupe {
	private ArrayList<Personnel> membres;
	
	public Groupe() {
		membres=new ArrayList<Personnel>();
	}
	
	public void ajouteMembre(Personnel nouveau) {
		membres.add(nouveau);
	}
	
	public ArrayList<Personnel> getMembres() {
		return membres;
	}
}
