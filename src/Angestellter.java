
public class Angestellter {
	
	private int angestelltennummer;
	
	public String fülltLager(String ware, int regalnummer) {
		return ware + " wurde von " + angestelltennummer + " in Regal Nr. " + regalnummer + " einsortiert.";
	}
	
	public String machtKundenservice(String kunde){
		return kunde + " wurde von " + angestelltennummer + " betreut.";
	}

	public int getAngestelltennummer() {
		return angestelltennummer;
	}
}
