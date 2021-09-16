import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String jogarNovamente = "sim";
		
		System.out.println(" Jogo: Jokenp�");
		System.out.println();
		
		while ( jogarNovamente.equals("sim")) {
			
			int numeroJogado;
			int numeroSorteado;
			int numeroPartidas = 0;
			int pontuacaoJogador = 0;
			int pontuacaoComputador = 0;
			
			System.out.print("Insira o n�mero de partidas: ");
			numeroPartidas = leitor.nextInt();
			
			while ( numeroPartidas % 2 == 0 || numeroPartidas < 3) {
				System.out.print("Este n�mero � inv�lido. Insira um n�mero �mpar e maior ou igual a tr�s: ");
				numeroPartidas = leitor.nextInt();
			}
			
			int contador = 0;
			
			while ( contador < numeroPartidas || pontuacaoJogador == pontuacaoComputador ) {
				
				System.out.println();
				System.out.println(" 1-Pedra ");
				System.out.println(" 2-Papel ");
				System.out.println(" 3-Tesoura ");
				System.out.println();
		
				System.out.println(" Jogador n�1 ");
				System.out.print(" Insira a arma com que jogar�: ");
				numeroJogado = leitor.nextInt();
				
				while ( numeroJogado > 3 ) {
					System.out.print(" N�mero inv�lido, Insira novamente: ");
					numeroJogado = leitor.nextInt();
				}
		
				if (numeroJogado == 1) {
					System.out.println(" Hmm..Escolher Pedra parece ser uma boa arma.");
				} else if (numeroJogado == 2) {
					System.out.println(" Hmm..Papel pode ser mais cortante que uma pr�pria tesoura. ");
				} else {
					System.out.println(" Hmm.. Edward M�os de Tesoura ficar� lisonjeado por homenagea-lo nesta batalha.");
				}
		
				System.out.println();
			
		
				Random sorteio = new Random();
				numeroSorteado = sorteio.nextInt(3) + 1;
		
				System.out.println(" Jogador n�2 (Computador)");
				System.out.print(" Arma do jogador n�2: " + numeroSorteado);
				System.out.println();
		
				if (numeroSorteado == 1) {
					System.out.println(" Hmm..Escolher Pedra parece ser uma boa arma.");
				} else if (numeroSorteado == 2) {
					System.out.println(" Hmm..Papel pode ser mais cortante que uma pr�pria tesoura.  ");
				} else {
					System.out.println(" Hmm.. Edward M�os de Tesoura ficar� lisonjeado por homenagea-lo nesta batalha. ");
				}
		
				System.out.println();
				System.out.println(" Que comece a Batalha! ");
				System.out.println();
		
				if (numeroJogado == 1 && numeroSorteado == 3 || numeroJogado == 2 && numeroSorteado == 1
						|| numeroJogado == 3 && numeroSorteado == 2) {
					System.out.println(" Vit�ria do jogador n�1.");
					pontuacaoJogador = pontuacaoJogador + 1;
					System.out.println();
				} else if (numeroSorteado == 1 && numeroJogado == 3 || numeroSorteado == 2 && numeroJogado == 1
						|| numeroSorteado == 3 && numeroJogado == 2) {
					System.out.println(" Vit�ria do jogador n�2.");
					pontuacaoComputador = pontuacaoComputador + 1;
					System.out.println();
				} else if (numeroSorteado > 3 || numeroJogado > 3) {
					System.out.println(
							" A batalha n�o pode ser iniciada at� que o jogador n�1 escolha sua arma corretamente. ");
				} else {
					System.out.println(" Empatou! � melhor ficar e lutar novamente. ");
				}
				 
				System.out.println(" PLACAR: Jogador " + pontuacaoJogador + " X " + pontuacaoComputador + " Computador");
				
				contador++;
				
				if ( pontuacaoJogador > numeroPartidas / 2 || pontuacaoComputador > numeroPartidas / 2 ) {
					contador = numeroPartidas;
				}
			}
			
			if ( pontuacaoJogador > pontuacaoComputador ) {
				System.out.println("Voc� n�o � mais o Lord, porque eu sou o Rei! Jogador n�1 Venceu por " + pontuacaoJogador + " X " + pontuacaoComputador);
			} else {
				System.out.println("A revolu��o das m�quinas est� por vir! Jogador n�2 Venceu por " + pontuacaoComputador + " X " + pontuacaoJogador);
			}
			
			System.out.println();
			System.out.println("Deseja Jogar novamente? ");
			jogarNovamente = leitor.next();
			
		}
		
		System.out.println(" FIM ");
		leitor.close();
	}

}
