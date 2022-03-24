package main;

import java.util.Locale;
import java.util.Scanner;
import methods.Menu;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();

		menu.Repetidor(sc);

		sc.close();

	}

}
