package desafio01;

import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = scan.nextInt();
		
		Desafio01Solucao solucao = new Desafio01Solucao();
		
		System.out.print(solucao.criarEscada(n));
		
		scan.close();
	}
}
