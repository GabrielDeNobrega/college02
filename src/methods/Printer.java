package methods;

public class Printer {

	public void imprimeVetor(int[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Índice %d: %d%n", (i), a[i]);
		}
		
		System.out.println();

	}
	
	public void imprimePesquisa(int position, int goalNum) {

		if (position != -1) {
			System.out.printf("O número %d foi encontrado na posição %d do vetor!%n", goalNum, position);

		} else {

			System.out.println("O valor não foi encontrado no vetor!");

		}

	}
}