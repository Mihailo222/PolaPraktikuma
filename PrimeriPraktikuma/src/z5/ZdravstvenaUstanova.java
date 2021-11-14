package z5;

public class ZdravstvenaUstanova {
	String naziv;
	String adresa;
	
	ZdravstvenaUstanova(){
		naziv="nepoznato";
		adresa="nepoznato";
	}
	
	
	
	ZdravstvenaUstanova(String naziv){
		this.naziv=naziv;
		
	}
	
	ZdravstvenaUstanova(String naziv, String adresa){
		this.naziv=naziv;
		this.adresa=adresa;
	}
	
	void ispisi() {
		System.out.println("Adresa je:"+adresa+", a naziv je:"+naziv);
	}

}
