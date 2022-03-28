package methods;

public class Printer {

	public void imprimeVetor(int[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("�ndice %d: %d%n", (i), a[i]);
		}
		
		System.out.println();

	}
	
	public void imprimePesquisa(int position, int goalNum) {

		if (position != -1) {
			System.out.printf("O n�mero %d foi encontrado na posi��o %d do vetor!%n", goalNum, position);

		} else {

			System.out.println("O valor n�o foi encontrado no vetor!");

		}

	}
}