package exercicios;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int acumulador = 1;
		System.out.print("Digite um número e saiba seu fatorial:");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.print("Esse número é inválido");
		}
		else {
			System.out.printf("%d! = ", a); //ex: 5! = 
		
			for (int contador = a; contador != 0; contador--) {
				System.out.printf("%d", contador);
				if (contador != 1) {
					System.out.printf("*"); //para ficar bonitinho na tela
				}// end if
				acumulador *= contador; //acumulador = acumulador * contador
			}// end for
			System.out.printf(" = %d.", acumulador); // por algum motivo funciona do 1 ao 16
		sc.close();
		
		}
	}

}
