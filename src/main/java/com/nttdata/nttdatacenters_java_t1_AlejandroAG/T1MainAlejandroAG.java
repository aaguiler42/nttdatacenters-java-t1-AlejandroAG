package com.nttdata.nttdatacenters_java_t1_AlejandroAG;

import java.util.Scanner;

import com.nttdata.nttdatacenters_java_t1_AlejandroAG.game.Game;

/**
 * @author Alejandro Aguilera García
 */
class T1MainAlejandroAG {
	public static void main(String[] args) {

		// Puntos totales
		int points = 0;

		// Puntos de la partida
		int gamePoints;

		// Opcion elegida por el usuario
		int option;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Menú opciones
		do {

			System.out.println("1.- For playing");
			System.out.println("2.- For start from zero");
			System.out.println("3.- For exit");

			option = sc.nextInt();

			// Validación de opción
			while (option < 1 || option > 3) {

				System.out.println("Please, enter a valid option");
				option = sc.nextInt();

			}

			// Comprobación de opción
			switch (option) {

			case 2:
				points = 0;

			case 1:
				gamePoints = 0;
				Game game = new Game();
				gamePoints = game.launchAndStart();
				points += gamePoints;
				System.out.println(game.getGamePoints(gamePoints));
				break;

			case 3:
				break;

			default:

			}

			System.out.println("You have: " + points + " points");

		} while (option != 3);

		// Cierre del Scanner
		sc.close();

	}
}