package desafio01;

public class Desafio01Solucao {
	
	private String escada = "";
	
	public String criarEscada(int n) {
		
		for(int x = 1; x <= n; x++) {
			
			// Imprime os espaços na esquerda
			for(int y = 0; y < n - x; y++) {
				escada += " ";
			}
			
			// Imprime os asteriscos na direita
			for(int z = 0; z < x; z++) {
				escada += "*";
			}
			
			// Impede que seja impresso a última linha vazia
			if(x != n) {
				escada += "\n";
			}
		}
		
		return escada;
		
	}
}
