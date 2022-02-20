package desafio03;

public class Desafio03Solucao {
	
	private int anagramasPares = 0;
	
	public int verificaPalavra(String palavra) {
		
		for(int x = 0; x < palavra.length(); x++) {
			
			// Inicia a inspeção começando com a primeira letra
			char letra = palavra.charAt(x);
			
			// Verifica as letras seguintes
			for(int y = x + 1; y < palavra.length(); y++) {
				
				// Verifica se a palavra possui outra letra igual
				if(Character.compare(letra, palavra.charAt(y)) == 0) {
			        anagramasPares++;
					
			        // verifica se a distância entre as letras iguais permite um novo anagrama par
					if(y > x + 1) anagramasPares++;
				}
			}
		}
		
		return anagramasPares;
		
	}
	
}
