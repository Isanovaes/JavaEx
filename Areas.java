package NA;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a,b,c;
		System.out.print("Digite o valor de a : ");
		a = sc.nextFloat();
		System.out.print("Digite o valor de b: ");
		b = sc.nextFloat();
		System.out.print("Digite o valor de c: ");
		c = sc.nextFloat();
		sc.close();
		
		System.out.printf("Triangulo : %.3f%n ", (a*c)/2 );
		System.out.printf("Círculo : %.3f%n", 3.14159*c*c );
		System.out.printf("Trapézio: %.3f%n", ((a+b)*c)/2 );
		System.out.printf("Retângulo: %.3f%n", a*b );
	}

}
