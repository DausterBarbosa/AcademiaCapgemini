package desafio02;

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String password = scan.nextLine();
		
		// Controle dos caracteres de segurança
		boolean contemDigito = false;
		boolean contemMinusculo = false;
		boolean contemMaiusculo = false;
		boolean contemCharEspecial = false;
		
		// Caracteres especiais
		char charEspeciais[] = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
		
		// Verifica se existem digitos na senha
		for(char x = '0'; x <= '9' ; x++) {
			if(password.indexOf(x) != -1) {
				contemDigito = true;
				break;
			}
		}
		
		// Verifica se existem letras minúsculas na senha
		for(char x = 'a'; x <= 'z'; x++) {
			if(password.indexOf(x) != -1) {
				contemMinusculo = true;
				break;
			}
		}
		
		// Verifica se existem letras maiúsculas na senha
		for(char x = 'A'; x <= 'Z'; x++) {
			if(password.indexOf(x) != -1) {
				contemMaiusculo = true;
				break;
			}
		}
		
		// Verifica se existem caracteres especiais na senha
		for(int x = 0; x < charEspeciais.length; x++) {
			if(password.indexOf(charEspeciais[x]) != -1) {
				contemCharEspecial = true;
				break;
			}
		}
		
		//Verifica os digitos de segurança que faltam
		int digitosDeSegurancaFaltando = 0;
		
		if(!contemDigito) digitosDeSegurancaFaltando++;
		if(!contemMinusculo) digitosDeSegurancaFaltando++;
		if(!contemMaiusculo) digitosDeSegurancaFaltando++;
		if(!contemCharEspecial) digitosDeSegurancaFaltando++;
		
		//Mostra quantos digitos faltam levando em consideração os digitos de segurança
		if(password.length() >= 6) {
			System.out.print(digitosDeSegurancaFaltando);
		} else {
			if(6 - password.length() <  digitosDeSegurancaFaltando) {
				System.out.print(digitosDeSegurancaFaltando);
			} else {
				System.out.print(6 - password.length());
			}
		}
		
		scan.close();
	}
}
