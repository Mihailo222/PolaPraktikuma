package z9;

public class Sifrarnik {
	static void ispisiOcenu(int ocena) {
		switch(ocena) {
		case 5:
			System.out.println("Odlican");
			break;
		case 4:
			System.out.println("Vrlodobar");
			break;
		case 3:
		   System.out.println("Dobar");
		   break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 1:
			System.out.println("Nedovoljan");
			break;
		default:
			System.out.println("Error");
		}
	}
	
	static String vratiOcenu(int ocena) {
		switch(ocena) {
		case 5:
			return "odlican";
		case 4:
			return "vr. dobar";
		case 3:
			return "dobar";
		case 2:
			return "dovoljan";
		case 1:
			return "nedovoljan";
		default:
			return "greska";			
		}
	}
	
	
	
	static void proveriZnak(char c) {
		switch(c) {
		case'!':
		case'.':
		case',':
		case'?':
		case';':
		case':':
			System.out.println("Znak interpunkcije");
			break;
		case'0':
		case'1':
		case'2':
		case'3':
		case'4':
		case'5':
		case'6':
		case'7':
		case'8':
		case'9':
			System.out.println("Cifra");
			break;
			}
	}
	
	

}
