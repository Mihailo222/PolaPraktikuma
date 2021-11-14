package z3;

public class KonvertorMetrickihJedinica {
	double konvertujKilometreUMilje( double duzinaUKilometrima) {
		double duzinaUMiljama;//lokalna promenljiva
		duzinaUMiljama=duzinaUKilometrima*1609;
		return duzinaUMiljama;
	}
	
	
	double konvertujMiljeUKilometre(double duzinaUMiljama) {
		double duzinaUKilometrima;
		duzinaUKilometrima=duzinaUMiljama/1609;
		return duzinaUKilometrima;
	}
	
	double konvertujStopeUSantimetre(double duzinaUCentimetrima) {
		double duzinaUStopama;
		duzinaUStopama=duzinaUCentimetrima*30.48;
		return duzinaUStopama;
	}
	
	double konvertuCentimetreUStope(double duzinaUStopama) {
		double duzinaUCentimetrima;
		duzinaUCentimetrima=duzinaUStopama/30.48;
		return duzinaUCentimetrima;
	}
	
	

}
