package z10;

public class SlozeniIspisivac {
static void ispisiParneOd1Do23() {
	for(int i=1; i<=25; i++) {
		if(i%2==0) {
		System.out.println(i);
		}
	}
}


//ispisi matricu 6x4 od jdinica
static void ispisiMatricu() {
for(int i=1; i<=4; i++) {    // koliko ima redova
	for(int j=1 ; j<=6; j++) System.out.print(1+" ");   //koliko ima u redu---ponavljaj ovo 6 puta 1+" "
   System.out.println();
}
}

static void ispisiMinDeljiveSa12i15i9() {
	for(int i=10; i<=1000; i++)
		if(i%2==0 && i%9==0 && i%15==0) { 
			System.out.println(i);
			break;   // jer samo treba da ispises minimalne deljive sa 2, 9, 15 i onda stajes da ne bi ispisivao sve
		}
	
}


static int vratiMinDeljiveSa9I12I15() {
	for(int i=10; i<=100; i++) 
		if(i%12==0 && i%9==0 && i%15==0) 
			return i;                        //ova naredba vraca taj broj deljiv sa 12, 15 i 9 i ona prekida for petlji bez break, jer nema
	                                         // blokova, pa sve ide redom i ne ponavlja se ciklicno
		
	return 0;
}


void ispisiOd1Do50() {
	for(int i=1; i<=50; i++) {
		System.out.println(i);
	}
}

void ispisiOd0Do50() {
	for(int i=50;i<=0; i--) {
		System.out.println(i);
	}
}

void ispisiOd0Do32() {
	for(int i=32; i<=-2; i--) {
		System.out.println(i);
	}
}

void ispisiOd0DoN(int n) {
	for(int i=0; i<=n; i++) {
		System.out.println(i);
	}
}


static int izracunajSumuNBrojeva(int n) {
	int suma=0;
	for(int i=0; i<=n;i++) {
		suma=suma+i;
		System.out.println(i);
	}
	return suma;
}


static int faktorijel(int n) {
	int p=1;
	for(int i=1; i<=n; i++){
		p=p*i;
	}
	return p;
}

static int dvaNaN(int n) {
	int f=1;
	for(int i=0; i<=n; i++) {
		f=f*2;
	}
	return f;
}

static int triNaN(int n) {
	int f=1;
	for(int i=0; i<=n;i++) {
		f=f*3;
	}
	return f;
}


static double xNaN(double x, int n) {
  double r=1;
  for(int i=0; i<=n; i++) {
	  r=r*x;
  }
  return r;
}


static int aPlusBnaN(int a, int b, int n) {
	int rezultat=1;
	for(int i=0; i<=n; i++) {
		rezultat=rezultat*(a+b);
	}
	return rezultat;
}


static int sumaOdADoB(int a, int b) {
	int s=0;
	for(int i=a; i<=b; i++) {
		s=s+i;
	}
	return s;
}


static int sumaAbezB(int a, int b) {
	int s=0;
	for(int i=a; i<b; i++) {
		s=s+i;
	}
	return s;
}

static int sumaParnihAB(int a, int b) {
	int s=0;
	for(int i=a; i<=b; i++) {
		if(i%2==0)
			s=s+i;
	}
	return s;
}


 static  int sumaOdADoBDeljivihSaTri(int a, int b) {
	int  s=0;
	 for(int i=a; i<=b; i++) {
		 if(i%3==0)
			 s=s+i;
	 }
	 return s;
 }

 static int sumaPozitivnihOdADoB(int a, int b) {
	 int s=0;
	 for(int i=a; i<=b; i++) if(i>0) s=s+i;
	 return s;
 }
 
 
 /*
  1111
  2222
  3333
  4444*/
 
 
 static void  ispisiMatricuSledecu() {
	 for(int i=1; i<=4; i++) { 
		 for(int j=1; j<=4; j++) 
			 System.out.println(i+" "); //i =1  j=[1, 4] 1111
		                                //i=2   j=[1,4] 2222
		                                // ...
	 }
	 }
 
 //ispisuje kvadratnu jedinicnu matricu reda n
 static void matricaJedinicna(int n) {
	 if(n<0)
		 System.out.println("Error");
	 else {
		 for(int i=1; i<=n; i++)
			 for(int j=0; j<=n; j++) {
				 if(i==j) System.out.print(1 +" ");
				 else System.out.print(0 + " ");
				 System.out.println();
			 }
	 }
 }
 
 
 //????????????????????????????????????????????????????????????
 
 
 
 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 









































