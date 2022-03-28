package methods;

import java.util.Scanner;

public class Menu {

	public int escolher(Scanner sc) {

		System.out.printf("***--- MENU ---***%n%n" + "**-- Digite o número da operação que deseja realizar --**%n%n");
		System.out.printf("01 - Vetor ordenado com Insertion Sort até o número 44 atingir o índice 6%n"
				+ "02 - Vetor ordenado com Selection Sort%n" + "03 - Realizar Binary Search%n"
				+ "04 - Sair do Programa%n%n");
		int escolha = sc.nextInt();

		return escolha;
	}

	public void pesquisador(int[] vetor, Scanner sc) {

		BinarySearch bs = new BinarySearch();
		Printer pr = new Printer();

		int goalNum;

		System.out.println("Digite o número que deseja pesquisar: ");
		goalNum = sc.nextInt();
		bs.binarySearch(vetor, goalNum);
		int position = bs.binarySearch(vetor, goalNum);
		pr.imprimePesquisa(position, goalNum);
		System.out.println();

	}

	public void repetidor(Scanner sc) {

		SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();
		Printer pr = new Printer();

		int[] vetor = { 15, 25, 32, 8, 5, 44, 9, 87 };
		int[] vetorAux = new int[vetor.length];
		int aux;

		do {

			aux = escolher(sc);

			switch (aux) {

			case 1:
				vetorAux = is.is(vetor);
				pr.imprimeVetor(vetorAux);
				break;

			case 2:
				ss.ss(vetorAux);
				pr.imprimeVetor(vetorAux);
				break;

			case 3:
				pesquisador(vetorAux, sc);
				break;

			case 4:
				break;
			}

		} while (aux != 4);

	}

}