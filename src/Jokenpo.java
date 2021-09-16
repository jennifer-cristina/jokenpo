import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String jogarNovamente = "sim";
		
		System.out.println(" Jogo: Jokenpô");
		System.out.println();
		
		while ( jogarNovamente.equals("sim") || jogarNovamente.equals("S") || jogarNovamente.equals("s") || jogarNovamente.equals("Sim")) {
			
			int numeroJogado;
			int numeroSorteado;
			int numeroPartidas = 0;
			int pontuacaoJogador = 0;
			int pontuacaoComputador = 0;
			
			System.out.print("Insira o número de partidas: ");
			numeroPartidas = leitor.nextInt();
			
			while ( numeroPartidas % 2 == 0 || numeroPartidas < 3) {
				System.out.print("Este número é inválido. Insira um número ímpar e maior ou igual a três: ");
				numeroPartidas = leitor.nextInt();
			}
			
			int contador = 0;
			
			while ( contador < numeroPartidas || pontuacaoJogador == pontuacaoComputador ) {
				
				System.out.println();
				System.out.println(" 1-Pedra ");
				System.out.println(" 2-Papel ");
				System.out.println(" 3-Tesoura ");
				System.out.println();
		
				System.out.println("Jogador nº1 ");
				System.out.print("Insira a arma com que jogará: ");
				numeroJogado = leitor.nextInt();
				
				while ( numeroJogado > 3 ) {
					System.out.print("Número inválido, Insira novamente: ");
					numeroJogado = leitor.nextInt();
				}
		
				if (numeroJogado == 1) {
					System.out.println("Hmm..Escolheu Pedra parece ser uma boa arma.");
				} else if (numeroJogado == 2) {
					System.out.println("Hmm..Papel pode ser mais cortante que uma própria tesoura. ");
				} else {
					System.out.println("Hmm.. Edward Mãos de Tesoura ficará lisonjeado por homenagea-lo nesta batalha.");
				}
		
				System.out.println();
			
		
				Random sorteio = new Random();
				numeroSorteado = sorteio.nextInt(3) + 1;
		
				System.out.println("Jogador nº2 (Computador)");
				System.out.print("Arma do jogador nº2: " + numeroSorteado);
				System.out.println();
		
				if (numeroSorteado == 1) {
					System.out.println("Hmm..Escolheu Pedra parece ser uma boa arma.");
				} else if (numeroSorteado == 2) {
					System.out.println("Hmm..Papel pode ser mais cortante que uma própria tesoura.  ");
				} else {
					System.out.println("Hmm.. Edward Mãos de Tesoura ficará lisonjeado por homenagea-lo nesta batalha. ");
				}
		
				System.out.println();
				System.out.println("Que comece a Batalha! ");
				System.out.println();
		
				if (numeroJogado == 1 && numeroSorteado == 3 || numeroJogado == 2 && numeroSorteado == 1
						|| numeroJogado == 3 && numeroSorteado == 2) {
					System.out.println("Vitória do jogador nº1.");
					pontuacaoJogador = pontuacaoJogador + 1;
					System.out.println();
				} else if (numeroSorteado == 1 && numeroJogado == 3 || numeroSorteado == 2 && numeroJogado == 1
						|| numeroSorteado == 3 && numeroJogado == 2) {
					System.out.println("Vitória do jogador nº2.");
					pontuacaoComputador = pontuacaoComputador + 1;
					System.out.println();
				} else if (numeroSorteado > 3 || numeroJogado > 3) {
					System.out.println(
							"A batalha não pode ser iniciada até que o jogador nº1 escolha sua arma corretamente. ");
				} else {
					System.out.println("Empatou! É melhor ficar e lutar novamente. ");
				}
				 
				System.out.println("PLACAR: Jogador " + pontuacaoJogador + " X " + pontuacaoComputador + " Computador");
				
				contador++;
				
				if ( pontuacaoJogador > numeroPartidas / 2 || pontuacaoComputador > numeroPartidas / 2 ) {
					contador = numeroPartidas;
				}
			}
			
			System.out.println();
			if ( pontuacaoJogador > pontuacaoComputador ) {
				System.out.println("Você não é mais o Lord, porque eu sou o Rei! Jogador nº1 Venceu por " + pontuacaoJogador + " X " + pontuacaoComputador);
			} else {
				System.out.println("A revolução das máquinas está por vir! Jogador nº2 Venceu por " + pontuacaoComputador + " X " + pontuacaoJogador);
			}
			
			System.out.println();
			System.out.println("_________________________________________________________________________________________");
			System.out.println();
			System.out.print("Deseja Jogar novamente? ");
			jogarNovamente = leitor.next();
			
		}
		
		System.out.println(" FIM ");
		leitor.close();
	}

}
