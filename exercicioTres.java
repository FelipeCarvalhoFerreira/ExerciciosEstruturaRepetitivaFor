package exerciciosEstruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Informar Numero");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			 
			 
			 double pValor = sc.nextDouble();
			 double sValor = sc.nextDouble(); 
			 double tValor = sc.nextDouble();
			 
			 
			 double media = (pValor * 2.0 + sValor * 3.0 + tValor * 5.0) / 10.0; 
			 
			 System.out.printf("%.1f%n", media);
			 ;
			
		}
	
		sc.close();

	}

}
