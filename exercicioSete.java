package exerciciosEstruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Informar Numero");
		Scanner sc = new Scanner(System.in);

	
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
		int primeiro = i;
		int segundo = i * i;
		int terceiro = i * i * i;
		
		System.out.printf("%d %d %d%n" , primeiro, segundo, terceiro);
			
		}
		
		sc.close();

	}

}
