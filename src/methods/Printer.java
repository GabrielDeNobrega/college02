package methods;

public class Printer {

	public void imprimeVetor(int[] a) {

		System.out.printf("%n");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("�ndice %d: %d%n", (i), a[i]);
		}

	}
}