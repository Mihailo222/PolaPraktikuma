package z5;

public class Test {
public static void main(String[] args) {
	
	ZdravstvenaUstanova z;
	z=new ZdravstvenaUstanova();
	ZdravstvenaUstanova z1=new ZdravstvenaUstanova("Stolica");
	ZdravstvenaUstanova z2=new ZdravstvenaUstanova("Doktor", "J. Ilica, 45");
	z.ispisi();
	z1.ispisi();
	z2.ispisi();
	
	
	
	
}
}
