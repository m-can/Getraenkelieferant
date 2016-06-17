
public class Lieferant {
	
	private boolean geliefert;
	private int lieferantennummer;
	
	public String liefertWare(String ware, String kunde, int anzahl) {
		if(anzahl > 0) {
			geliefert = true;
			return anzahl + "x " + ware + " wird von " + lieferantennummer + " an " + kunde + " geliefert.";
		}
		else {
			geliefert = false;
			throw new IllegalArgumentException("Die Warenanzahl muss größer als 0 sein");
		}
	}
	
	public boolean hatGeliefert() {
		if (geliefert)
			return true;
		else
			return false;
	}

	public int getLieferantennummer() {
		return lieferantennummer;
	}
	
}
