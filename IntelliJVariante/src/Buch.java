
public class Buch implements Medien{

	private String isbn;
	private String titel;
	private String standort;
	private double wert;


	public Buch(String titel, double wert, String standort, String isbn) {
		this.titel = titel;
		this.wert = wert;
		this.standort = standort;
		this.isbn = isbn;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getStandort() {
		return standort;
	}

	public void setStandort(String standort) {
		this.standort = standort;
	}

	public double getWert() {
		return wert;
	}

	public void setWert(double wert) {
		this.wert = wert;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void anzeigen(String titel, String standort, double wert)//�berschreiben der Mutterklassenmethode
	{
		System.out.println("Medium: Titel -> " + this.getTitel() + " Standort -> " + this.getStandort() + " Wert -> " + this.getWert());
		System.out.println("[Buch] : ISBN -> " + this.getIsbn());
	}
}
