package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		System.out.printf("A tabuada de %d é: ",n);
		for(int i = 0; i<=10; i++) {
			System.out.println(" ");
			System.out.printf("%d * %d = %d", n, i, n*i);
		} //end for  
        sc.close();
	}

}
