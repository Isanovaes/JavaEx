package NotSerious;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double temp, x1, x2;
		char resp, escala; 
		
		System.out.print("Digite a temperatura em Celsius:");
		temp = sc.nextDouble();
		System.out.print("Digite em qual escala deseja saber (F/K):");
		escala = sc.next().charAt(0);
		
		if (escala == 'F') {
			 x1 = 9*temp/5 + 32;
		     System.out.printf("Equivalente em Fahrenheit: %.1f%n", x1 );
		     System.out.println("Deseja repetir (s/n)?");
		     resp = sc.next().charAt(0);
		     if (resp == 's') {
					do {
						System.out.print("Digite a temperatura em Celsius:");
						temp = sc.nextDouble();
						x1 = 9 * temp / 5 + 32;
						System.out.printf("Equivalente em Fahrenheit: %.1f%n ", x1);
						System.out.println("Deseja repetir (s/n)?");
						resp = sc.next().charAt(0);
					} while (resp == 's');
		     }//end if
	    }// end if
		if (escala == 'K') {
			x2 = temp + 273;
			System.out.printf("Equivalente em Kelvin: %.1f%n", x2);
			System.out.println("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
			if (resp == 's') {
				do {
					System.out.print("Digite a temperatura em Celsius:");
					temp = sc.nextDouble();
					x2 = temp + 273;
					System.out.printf("Equivalente em Kelvin: %.1f%n", x2);
					System.out.println("Deseja repetir (s/n)?");
					resp = sc.next().charAt(0);
				} while (resp == 's');
			}//end if
		}//end if
		
		sc.close();

	}

}
