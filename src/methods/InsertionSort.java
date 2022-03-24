package methods;

public class InsertionSort {

	public int[] is(int vetor[]) {

		int currentPosi, aux;

		for (int i = 1; i < vetor.length; i++) {

			currentPosi = i;

			if (vetor[6] == 44) {

				return vetor;

			}

			while (vetor[currentPosi] < vetor[currentPosi - 1]) {

				aux = vetor[currentPosi];
				vetor[currentPosi] = vetor[currentPosi - 1];
				vetor[currentPosi - 1] = aux;
				currentPosi--;

				if (currentPosi == 0) {

					break;

				}

			}

		}

		return vetor;
	}
}