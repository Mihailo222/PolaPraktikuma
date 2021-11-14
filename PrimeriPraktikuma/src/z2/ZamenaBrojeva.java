package z2;

public class ZamenaBrojeva {
	
	
	
	void zameniMesta(int a, int b){
		int pomocna;
		pomocna=a; //na ADRESI od pomocne je vrednost a, ADRESA A JE PRAZNA
		a=b;      //na ADRESI od a je VREDNOST b, ADRESA B JE PRAZNA
		b=pomocna; //na ADRESI OD B je VREDNOST pomocne
	}
	
	
	//metoda zameni mesta brojevima koja dobija objekat iz klase Brojevi kao 
	//ulazni parametar
	void zameniMesta2(Brojevi br) { //parametar je objekat klase Brojevi
		int pomocna;          
		pomocna=br.a;
		br.a=br.b;
		br.b=pomocna;
	}

}
