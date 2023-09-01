package exerciciosEstruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		System.out.println("Informar Numero");
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i <= n; i++) {
			
			
			
			n = sc.nextInt();
			
			if (n >=10 && n <=20) {
				in = in + 1;
				
			} else
				out = out + 1;
				
		}
		System.out.println(out + " out");
		System.out.println(in + " in");
		sc.close();

	}

}
