package desafio02;

public class Desafio02Solucao {
	
	// Controle dos caracteres de segurança
	private boolean contemDigito = false;
	private boolean contemMinusculo = false;
	private boolean contemMaiusculo = false;
	private boolean contemCharEspecial = false;
	
	// Caracteres especiais
	private char charEspeciais[] = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
	
	//Digitos de segurança que faltam na senha
	int digitosDeSegurancaFaltando = 0;
	
	public int verificarSenha(String senha) {
		
		// Verifica se existem digitos na senha
		for(char x = '0'; x <= '9' ; x++) {
			if(senha.indexOf(x) != -1) {
				contemDigito = true;
				break;
			}
		}
		
		// Verifica se existem letras minúsculas na senha
		for(char x = 'a'; x <= 'z'; x++) {
			if(senha.indexOf(x) != -1) {
				contemMinusculo = true;
				break;
			}
		}
		
		// Verifica se existem letras maiúsculas na senha
		for(char x = 'A'; x <= 'Z'; x++) {
			if(senha.indexOf(x) != -1) {
				contemMaiusculo = true;
				break;
			}
		}
		
		// Verifica se existem caracteres especiais na senha
		for(int x = 0; x < charEspeciais.length; x++) {
			if(senha.indexOf(charEspeciais[x]) != -1) {
				contemCharEspecial = true;
				break;
			}
		}
		
		//Verifica os digitos de segurança que faltam
		if(!contemDigito) digitosDeSegurancaFaltando++;
		if(!contemMinusculo) digitosDeSegurancaFaltando++;
		if(!contemMaiusculo) digitosDeSegurancaFaltando++;
		if(!contemCharEspecial) digitosDeSegurancaFaltando++;
		
		//Mostra quantos digitos faltam levando em consideração os digitos de segurança
		if(senha.length() >= 6) {
			return digitosDeSegurancaFaltando;
		} else {
			if(6 - senha.length() <  digitosDeSegurancaFaltando) {
				return digitosDeSegurancaFaltando;
			} else {
				return 6 - senha.length();
			}
		}
		
	}
	
}
