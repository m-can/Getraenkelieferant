import static org.junit.Assert.*;

import org.junit.Test;

public class AngestellterTest {

	@Test
	public void fülltLager() {
		Angestellter tester = new Angestellter();
		String ware = "Apfelsaft";
		int regalnummer = 2546463;
		String expected = ware + " wurde von " + tester.getAngestelltennummer() + " in Regal Nr. " + regalnummer + 
				" einsortiert.";
		String actual = tester.fülltLager("Apfelsaft", 2546463);
		assertEquals(expected, actual);
	}
	@Test
	public void machtKundenservice() {
		Angestellter tester = new Angestellter();
		String kunde = "Manuel Neuer";
		String expected = kunde + " wurde von " + tester.getAngestelltennummer() + " betreut.";
		String actual = tester.machtKundenservice("Manuel Neuer");
		assertEquals(expected, actual);
	}

}
