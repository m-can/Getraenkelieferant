package de.mustafacan.getraenkelieferant.test;
import static org.junit.Assert.*;
import de.mustafacan.getraenkelieferant.src.*;

import org.junit.Test;

public class BesitzerTest {

	@Test
	public void schließtHandelsverträgeAb() {
		Besitzer tester = new Besitzer();
		String vertragspartner = "DFB";
		String expected = "Schließt mit " + vertragspartner + " Vertrag ab.";
		String actual = tester.schließtHandelsverträgeAb(vertragspartner);
		assertEquals(expected, actual);
	}
	
	@Test
	public void stelltManagerEin() {
		Besitzer tester = new Besitzer();
		String vorname = "Andre";
		String name = "Schürrle";
		String expected = "Stellt " + name + ", " + vorname + " ein.";
		String actual = tester.stelltManagerEin(vorname, name);
		assertEquals(expected, actual);
	}
	

}
