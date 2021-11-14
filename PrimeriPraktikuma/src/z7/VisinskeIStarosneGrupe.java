package z7;

public class VisinskeIStarosneGrupe {
	
	
	
	
	void proveriVisinu(double visinaUCentimetrima) {
		if(visinaUCentimetrima>120 &&  visinaUCentimetrima<240) {
			if(visinaUCentimetrima<=158) {
				System.out.println("Osoba pripada niskim osobama");
			}
			if(visinaUCentimetrima>158 && visinaUCentimetrima<=179) {
			   System.out.println("Pripada srednje visokim osobama");	
			}
			if(visinaUCentimetrima>179)
				System.out.println("Osoba pripada viskoim osobama");
		}else
			System.out.println("Greska");
	}
	
	
	void proveriStarost(int godineOsobe) {
		if(godineOsobe<0 ||  godineOsobe>20)
	         System.out.println("Error");
		else {
			if(godineOsobe>=0 && godineOsobe<=30)
				System.out.println("Osoba je mlada");
			if(godineOsobe>=31 && godineOsobe<=55)
				System.out.println("Osoba je srednjeg doba");
			if(godineOsobe>56)
				System.out.println("Osoba je stara");
		}
		
	}
	
	
	
	
    
}


















