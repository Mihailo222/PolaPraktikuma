package z6;

public class Test {

	public static void main(String[] args) {
		ProveraCelihBrojeva p;
		p=new ProveraCelihBrojeva();
	    
		boolean s=p.proveriParnost(23);
		if(s==true)
			System.out.println("Broj je paran");
		else
			System.out.println("Broj je neparan");
		
	
		p.proveriZnak(-34);
		p.razliciti(23, 23);
		
	}

}
