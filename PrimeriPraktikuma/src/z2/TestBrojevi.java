package z2;

public class TestBrojevi {
public static void main(String[] args) {
	int a=10;
	int b=12;
	
	
	Brojevi br;
	br=new Brojevi();
	
	
	ZamenaBrojeva zb;
	zb=new ZamenaBrojeva();
	
	//POZIV ATRIBUTA PREKO OBJEKTA
	br.a=44;
	br.b=100;
	
	
	//zamena preko metode sa parametrom 
	System.out.println("Pre promene broj a je="+a+", a broj b je "+b);
	zb.zameniMesta(a, b);
	System.out.println("Posle promene broj a je="+a+", a broj b je "+b);

	
 	//zamena brojeva inicijalizovanih preko objekta
	System.out.println("Pre promene broj a je="+br.a+", a broj b je "+br.b);
    zb.zameniMesta2(br);
	System.out.println("Pre promene broj a je="+br.a+", a broj b je "+br.b);

    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
