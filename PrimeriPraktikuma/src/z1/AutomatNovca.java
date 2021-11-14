package z1;

public class AutomatNovca {
	double stanje=5200.0;
	
	
	//metoda podigniIznos
	void  podigniIznos(double zeljeniIznos) {
		stanje=stanje-zeljeniIznos;
	}
	
	//metoda uloziIznos
	void uloziIznos(double ulog) {
		stanje=stanje+ulog;
	}

	
	//metoda vrtatiStanje
	double vratiStanje() {
		return stanje;
	}
	
	//metoda ispisiStanje
	void ispisiStanje() {
		System.out.println("Stanje na vasem bankovnom racunu je:" + stanje);
		}
	
	
	
}
