package methods;

public class BinarySearch {

	public int PesquisaBinaria(int v[], int pesq) {
		int intComeco = 0;
		int intFinal = v.length - 1;
		int meio;

		while (intComeco <= intFinal) {

			meio = (intComeco + intFinal) / 2;

			if (pesq == v[meio])

				return meio;

			else if (pesq < v[meio])

				intFinal = meio - 1;

			else

				intComeco = meio + 1;

		}
		return -1;
	}

}
