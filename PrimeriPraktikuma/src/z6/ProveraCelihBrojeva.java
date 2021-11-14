package z6;

public class ProveraCelihBrojeva {

//metoda koja govori da li su dva broja razlicita

boolean razliciti(double a, double b) {
	if(a!=b) {
		System.out.println("Brojevi su razliciti");
	return true;
	}else {
		System.out.println("Brojevi su isti");
		return false;
	}
}


//metoda koja proverava parnost
boolean proveriParnost(int a) {
	if(a%2==0)
		return true;
	else
		return false;
}

//proveri znak broja

void proveriZnak(int a) {
	if(a>0)
		System.out.println("Broj je pozitivan");
	if(a<0)
		System.out.println("Broj je negativan");
	if(a==0)
		System.out.println("Broj je jednak nuli");
}

//metoda koja proverava da li je broj manji od nula ILI manji ili jednak od 200
void proveriRaspon(double a) {
	if(a<0 || a>33.3)
		System.out.println("Broj a pripada nasem rasponu");
	else 
		System.out.println("Broj a ne pripada nasem rasponu");
	}//moze da se radi i preko booleana sa return true/false


}
