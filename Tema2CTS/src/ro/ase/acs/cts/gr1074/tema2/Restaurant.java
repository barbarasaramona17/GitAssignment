package ro.ase.acs.cts.gr1074.tema2;

public class Restaurant implements IntefataRating {
	private String denumire;
	private String adresa;
	private int nrAngajati;

	public Restaurant(String denumire, String adresa, int nrAngajati) {
		super();
		this.denumire = denumire;
		this.adresa = adresa;
		this.nrAngajati = nrAngajati;
	}

	public String getDenumire() {
		return denumire;
	}

	
	@Override
	public void stabilesteRating() {
		if(this.nrAngajati > 50) {
			this.denumire = this.denumire + " Premium";
		}
		
	}
	
	
}
