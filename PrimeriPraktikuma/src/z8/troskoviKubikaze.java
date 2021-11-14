package z8;

public class troskoviKubikaze {
	static double troskoviRegistracije(Automobil automobil) {
		double cena;
		if(automobil.kubikaza<400 ||automobil.kubikaza>10000) {
			System.out.println("Error");
		       return -1.0;
		}
		else {
			if(automobil.kubikaza<1000)
			return cena=144.5;
			if(automobil.kubikaza>=100 && automobil.kubikaza<1400)
				return cena=200.0;
			if(automobil.kubikaza>=1400 && automobil.kubikaza<2500)
				return cena=250.0;
			if(automobil.kubikaza>=2500)
				return cena=413.3;
		}
		return 0;  //nema fju, ali bitna za javu, iako mi znamo da do ovog slucaja
        // nece doci, java to ne zna
	}
	
	
	static double obracunajOsiguranje(Automobil automobil) {
		if(automobil.snaga>=20 && automobil.kubikaza<=1000) {
			if(automobil.snaga<55) return 3000.0;
			if(automobil.snaga>=55 && automobil.snaga<150) return 4500.0;
			if(automobil.snaga>=75 && automobil.snaga<150) return 7300.0;	
			if(automobil.snaga<=150) return 9000.0;
		}else
			return 0.0;
		
	return 0;  //nema fju, ali bitna za javu, iako mi znamo da do ovog slucaja
	           // nece doci, java to ne zna
	}
	
	
	
	static void ispisiSveTroskove(Automobil automobil) {
		double troskoviRegistracije=troskoviKubikaze.troskoviRegistracije(automobil);
		double troskoviOsiguranja=troskoviKubikaze.obracunajOsiguranje(automobil);
		
		
		System.out.println("Troskovi registracije:"+ troskoviRegistracije);
		System.out.println("Troskovi osiguranja:" + troskoviOsiguranja);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
