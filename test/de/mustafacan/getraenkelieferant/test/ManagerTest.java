package de.mustafacan.getraenkelieferant.test;
import static org.junit.Assert.*;
import de.mustafacan.getraenkelieferant.src.*;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void stelleMitarbeiterEin() {
		Manager tester = new Manager();
		String name = "Kroos";
		String vorname = "Toni";
		String expected = "Der Mitarbeiter " + name + ", " + vorname + " wurde eingestellt.";
		String actual = tester.stelleMitarbeiterEin(name, vorname);
		assertEquals(expected, actual);
	}
	@Test
	public void organisiereWarenlieferung() {
		Manager tester = new Manager();
		String ware = "Kürbissaft";
		int anzahl = 9;
		String expected = anzahl + "x " + ware + " wurde geliefert.";
		String actual = tester.organisiereWarenlieferung(ware, anzahl);
		assertEquals(expected, actual);
	}

}
