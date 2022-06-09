package JavaProjectAvaliacao;

import java.util.Arrays;

public class ExercicioVetoresAB {

	public static void main(String[] args) {

		// Declaracao das variaveis
		int A[] = { 4, 6, 7, 1, 0 }, B[] = { 7, 1, 3, 1, 2 };
		int C = 0;
		int X = 0;

		// Exibir "Valores do vetor A maiores que 4"
		System.out.print("Valores do vetor A maiores que 4 sao: ");
		// Estrutura de repeticao numero de alocamentos do vetor
		for (X = 0; X < 5; X++) {

			// Estrutura de decisao valor vetor A maior que 4
			if (A[X] > 4) {

				// Exibir numeros do vetor A maiores que 4
				System.out.printf("%d ", A[X]);
			}
		}
		// Pular linha
		System.out.printf("\n");

		// Estrutura de repeticao numero de alocamentos do vetor
		for (X = 0; X < 5; X++) {

			// Estrutura de decisao valor vetor B maior que 4
			if (B[X] > 4) {

				// Exibir numeros do vetor B maiores que 4
				System.out.printf("Valores do vetor B maiores que 4 sao: %d", B[X]);
			}
		}

		// Pular linha
		System.out.printf("\n");
		// Exibir "Valores do vetor A menores ou iguais a 5"
		System.out.print("Valores do vetor A menores ou iguais a 5 sao: ");

		// Estrutura de repeticao numero de alocamentos do vetor
		for (X = 0; X < 5; X++) {

			// Estrutura de decisao valor vetor A menor igual a 5
			if (A[X] <= 5) {

				// Exibir valores do vetor A menores ou iguais a 5
				System.out.printf("%d ", A[X]);
			}
		}
		// Pular linha
		System.out.printf("\n");
		// Exibir "Valores do vetor B menores ou iguais a 5"
		System.out.print("Valores do vetor B menores ou iguais a 5 sao: ");

		for (X = 0; X < 5; X++) {
			// Estrutura de decisao valor vetor B menor igual a 5
			if (B[X] <= 5) {

				// Exibir valores do vetor B menores ou iguais a 5
				System.out.printf("%d ", B[X]);
				// Receber a multiplicacao do valor x dos Vetores A e B na variavel C
				C = A[X] * B[X];
			}
		}
		// Pular linha
		System.out.printf("\n");
		// Exibir valor da variavel C
		System.out.printf("O valor de C = %d", C);
	}
}
