package desafio01;

import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = scan.nextInt();
		
		for(int x = 1; x <= n; x++) {
			
			//Imprime os espaços na esquerda
			for(int y = 0; y < n - x; y++) {
				System.out.print(" ");
			}
			
			//Imprime os asteriscos na direita
			for(int z = 0; z < x; z++) {
				System.out.print("*");
			}
			
			//Impede que seja impresso a última linha vazia
			if(x != n) {
				System.out.println();
			}
		}
		
		scan.close();
	}
}
