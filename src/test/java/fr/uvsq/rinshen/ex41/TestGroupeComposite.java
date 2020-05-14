package fr.uvsq.rinshen.ex41;

import static org.junit.Assert.*;
import java.time.Month;
import org.junit.Test;

public class TestGroupeComposite {
	@Test
	public void testEquals() {
		Personnel p2 = new Personnel.Builder("Yaheza","Alexandra")
				.dateNaissance(15, Month.JULY, 1996)
				.fonction("Indescriptible")
				.numTelephone("0625648257")
				.build();
		Personnel p1 = new Personnel.Builder("Beleyan","Sofia")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		GroupeComposite g1 = new GroupeComposite();
		GroupeComposite g2 = new GroupeComposite();
		
		g1.ajouteMembre(p1);
		g1.ajouteMembre(p2);
		
		g2.ajouteMembre(p1);
		g2.ajouteMembre(p2);
		
		assertEquals(g1, g2);
	}
	
	@Test
	public void testAjouteMembre() {
		Personnel p1 = new Personnel.Builder("Beleyan","Sofia")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		GroupeComposite g = new GroupeComposite();
		g.ajouteMembre(p1);
		Personnel p2 = g.getMembres().get(0);
		
		assertEquals(p1, p2);
	}
	
	@Test
	public void testAjouteGroupe() {
		Personnel p2 = new Personnel.Builder("Yaheza","Alexandra")
				.dateNaissance(15, Month.JULY, 1996)
				.fonction("Indescriptible")
				.numTelephone("0625648257")
				.build();
		Personnel p1 = new Personnel.Builder("Sofia","Beleyan")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		GroupeFeuille g1 = new GroupeFeuille();
		GroupeFeuille g2;
		GroupeComposite c = new GroupeComposite();
		g1.ajouteMembre(p1);
		g1.ajouteMembre(p2);
		c.ajouteGroupe(g1);
		g2 = (GroupeFeuille)c.getSousGroupes().get(0);
		
		assertEquals(g1, g2);
	}
}
