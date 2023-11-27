package proekt_17;

import java.util.Scanner;

public class Kamataza1godina {

	public static void main(String[] args) {
	double d,k,iz;
	Scanner tastatura=new Scanner(System.in);
	System.out.println("Vnesete ja vrednosta za depozitot");
	d =tastatura.nextDouble();
	System.out.println ("Vnesete ja kamatnata stapka");
	k = tastatura.nextDouble();
	iz=d*k/100;
	System.out.println ("Iznosot za 1 godina e:"+iz);
	k=iz*12;
	System.out.println("Depozitot e:"+d);
	
	
			
			
	
	
	
	

	}

}
