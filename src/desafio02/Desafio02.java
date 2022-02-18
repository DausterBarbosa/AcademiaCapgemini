package desafio02;

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String senha = scan.nextLine();
		
		Desafio02Solucao solucao = new Desafio02Solucao();
		
		System.out.print(solucao.verificarSenha(senha));
		
		scan.close();
		
	}
}
