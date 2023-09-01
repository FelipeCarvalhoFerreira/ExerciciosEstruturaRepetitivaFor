package exerciciosEstruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioQuatro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Informar Numero");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double pValor = sc.nextDouble();
			double sValor = sc.nextDouble();
			
			if ( sValor == 0) {
				System.out.println("Divisao Impossivel");
				
			} else {
				double div = pValor / sValor;
				System.out.println("Divisao é: " + div);
			}
		}
		
		sc.close();

	}

}
