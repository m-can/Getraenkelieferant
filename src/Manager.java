
public class Manager {
	
	private int managernummer;
	
	public String stelleMitarbeiterEin(String name, String vorname) {
		return "Der Mitarbeiter " + name + ", " + vorname + " wurde eingestellt.";
	
	}
	
	public String organisiereWarenlieferung(String ware, int anzahl) {
		return anzahl + "x " + ware + " wurde geliefert.";
	}

}
