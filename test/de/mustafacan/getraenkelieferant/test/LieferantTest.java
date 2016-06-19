package de.mustafacan.getraenkelieferant.test;
import static org.junit.Assert.*;
import de.mustafacan.getraenkelieferant.src.*;

import org.junit.Test;

public class LieferantTest {

	@Test
	public void liefertWareErfolg() {
		Lieferant tester = new Lieferant();
		String ware = "Apfelsaft";
		String kunde = "Bastian Schweinsteiger";
		int anzahl = 2;
		String expected = anzahl + "x " + ware + " wird von " + tester.getLieferantennummer() + " an " + kunde + " geliefert.";
		String actual = tester.liefertWare(ware, kunde, anzahl);
		assertEquals(expected, actual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void liefertWareKeinErfolg() {
		Lieferant tester = new Lieferant();
		String ware = "Apfelsaft";
		String kunde = "Bastian Schweinsteiger";
		int anzahl = 0;
		tester.liefertWare(ware, kunde, anzahl);
	}
	@Test
	public void hatGeliefert() {
		Lieferant tester = new Lieferant();
		String ware = "Apfelsaft";
		String kunde = "Bastian Schweinsteiger";
		int anzahl = 1;
		tester.liefertWare(ware, kunde, anzahl);
		boolean expected = true;
		boolean actual = tester.hatGeliefert();
		assertEquals(expected, actual);
	}
	
}


