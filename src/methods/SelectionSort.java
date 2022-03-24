package methods;

public class SelectionSort {

	public int[] ss(int vetor[]) {

		int menor_posicao, aux;

		for (int i = 0; i < vetor.length; i++) {

			menor_posicao = i;

			for (int j = i + 1; j < vetor.length; j++) {

				if (vetor[j] < vetor[menor_posicao]) {

					menor_posicao = j;

				}

			}

			aux = vetor[menor_posicao];
			vetor[menor_posicao] = vetor[i];
			vetor[i] = aux;

		}

		return vetor;
	}
}