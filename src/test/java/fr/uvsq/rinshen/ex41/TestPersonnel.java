package fr.uvsq.rinshen.ex41;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPersonnel {
	@Test
	public void testNom() {
		Personnel p1 = new Personnel.Builder("Beleyan","Sofia")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		assertEquals(p1.getNom(), "Beleyan");
	}
	
	@Test
	public void testPrenom() {
		Personnel p1 = new Personnel.Builder("Beleyan","Sofia")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		assertEquals(p1.getPrenom(), "Sofia");
	}
	
	@Test
	public void testDateNaissance() {
		Personnel p1 = new Personnel.Builder("Beleyan","Sofia")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		assertEquals(p1.getDateNaissance(), LocalDate.of(1997, Month.JANUARY, 26));
	}
	
	@Test
	public void testNumTelephone() {
		Personnel p1 = new Personnel.Builder("Beleyan","Sofia")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		assertEquals(p1.getNumTelephone().get(0), "0655892225");
	}
	
	@Test
	public void testFonction() {
		Personnel p1 = new Personnel.Builder("Beleyan","Sofia")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		assertEquals(p1.getFonction(), "Indéfinie");
	}
	
	@Test
	public void testEquals() {
		Personnel p1 = new Personnel.Builder("Sofia","Beleyan")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		Personnel p2 = new Personnel.Builder("Sofia","Beleyan")
				.dateNaissance(26, Month.JANUARY, 1997)
				.fonction("Indéfinie")
				.numTelephone("0655892225")
				.build();
		assertEquals(p1, p2);
	}
}
