package fr.uvsq.rinshen.ex41;

public class GroupeFeuille extends Groupe {

	public GroupeFeuille() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof GroupeFeuille)) {
			return false;
		}
		GroupeFeuille test = (GroupeFeuille)obj;
		if (!this.getMembres().equals(test.getMembres())) {
			return false;
		}
		return true;
	}
}
