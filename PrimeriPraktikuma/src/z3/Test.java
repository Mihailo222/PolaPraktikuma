package z3;

public class Test {
	public static void main(String[] args) {
		KonvertorMetrickihJedinica k=new KonvertorMetrickihJedinica();
		
	double duzinaUKilometrima=k.konvertujKilometreUMilje(234.0);
	System.out.println( "Duz. u km je: "+duzinaUKilometrima);
	
	k.konvertuCentimetreUStope(123);
	System.out.println("Duzina 123cm u stopama je: "+k.konvertuCentimetreUStope(123));
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
