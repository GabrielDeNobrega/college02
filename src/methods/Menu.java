package methods;

import java.util.Scanner;

public class Menu {

	public int Escolher(Scanner sc) {

		System.out.printf("***--- MENU ---***%n%n" + "**-- Digite o número da operação que deseja realizar --**%n%n");
		System.out.printf("01 - Ordenar com Insertion Sort até o número 44 atingir o índice 6%n"
				+ "     Terminar de ordenar o vetor com Selection Sort%n%n" + "02 - Realizar Binary Search%n%n");
		int escolha = sc.nextInt();

		return escolha;
	}

	public void MenuMaster(int[] vetor, int escolha, Scanner sc) {

		SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();
		BinarySearch bs = new BinarySearch();
		Printer pr = new Printer();

		int[] a = null;
		int number;

		switch (escolha) {

		case 1:
			a = is.is(vetor);
			pr.imprimeVetor(a);
			ss.ss(a);
			pr.imprimeVetor(a);
			break;

		case 2:

			if (a == null) {

				System.out.println("Ordene o vetor antes de pesquisar.");

			}

			System.out.println("Digite o número que deseja pesquisar: ");
			number = sc.nextInt();
			bs.PesquisaBinaria(a, number);
			break;

		default:
			System.out.println("Escolha uma opção válida.");
			break;
		}
	}

	public void Repetidor(Scanner sc) {

		int[] vetor = { 15, 25, 32, 8, 5, 44, 9, 87 };
		int aux = 0;

		do {

			MenuMaster(vetor, Escolher(sc), sc);

			System.out.printf("%nDeseja sair do programa? Digite 1.%n" + "Deseja continuar? Digite 2.%n");
			aux = sc.nextInt();
			System.out.println();

		} while (aux != 1);

	}

}