package desafio03;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String palavra = scan.nextLine();
		
		Desafio03Solucao solucao = new Desafio03Solucao();
		
		System.out.println(solucao.verificaPalavra(palavra));
		
		scan.close();
	}
}
