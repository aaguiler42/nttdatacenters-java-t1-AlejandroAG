package com.nttdata.nttdatacenters_java_t1_AlejandroAG.game;

/**
 * Clase board (tablero)
 * 
 * @author Alejandro Aguilera García
 */
public class Board {

	// Ancho del tablero
	private int width;

	// Altura del tablero
	private int height;

	// Matriz del tablero
	private char[][] board;

	/**
	 * Constructor de la clase Board
	 */
	public Board() {

		this.width = 15;
		this.height = 20;
		this.board = new char[this.height][this.width];

		// Inicialización del tablero, colocación de obstaculos
		for (int i = 0; i < this.height; i++) {

			for (int j = 0; j < this.width; j++) {

				if (i == 0 && j == 0) {

					board[i][j] = '+';

				} else if (i == 0 && j == this.width - 1) {

					board[i][j] = '+';

				} else if (i == this.height - 1 && j == 0) {

					board[i][j] = '+';

				} else if (i == this.height - 1 && j == this.width - 1) {

					board[i][j] = '+';

				} else if (i == 0 || i == this.height - 1) {

					board[i][j] = '-';

				} else if (j == 0 || j == this.width - 1) {

					board[i][j] = '|';

				} else if (i == 5 && (j == 5 || j == 9)) {

					board[i][j] = '+';

				} else if (i == 5 && (j == 6 || j == 7 || j == 8)) {

					board[i][j] = '-';

				} else if (i == 4 && (j == 5 || j == 9)) {

					board[i][j] = '|';

				} else if (i == 12 && (j == 6 || j == 8)) {

					board[i][j] = '+';

				} else if (i == 12 && (j == 7)) {

					board[i][j] = '-';

				} else if (i == 11 && (j == 6 || j == 8)) {

					board[i][j] = '|';

				} else if ((i == 8 && j == 1) || (i == 9 && j == 2)) {

					board[i][j] = '\\';

				} else if ((i == 10 && j == 2) || (i == 11 && j == 1)) {

					board[i][j] = '/';

				} else if ((i == 8 && j == 13) || (i == 9 && j == 12)) {

					board[i][j] = '/';

				} else if ((i == 10 && j == 12) || (i == 11 && j == 13)) {

					board[i][j] = '\\';

				} else if ((i == 18 && j == 4) || (i == 17 && j == 3) || (i == 16 && j == 2) || (i == 15 && j == 1)) {

					board[i][j] = '\\';

				} else if ((i == 18 && j == 10) || (i == 17 && j == 11) || (i == 16 && j == 12)
						|| (i == 15 && j == 13)) {

					board[i][j] = '/';

				} else {

					board[i][j] = ' ';

				}

			}

		}

	}

	/**
	 * Método para el relleno del tablero
	 * 
	 * @return relleno del tablero
	 */
	public char getCoord(int x, int y) {

		return board[y][x];

	}

	/**
	 * Método para obtener la altura del tablero
	 * 
	 * @return altura del tablero
	 */
	public int getHeight() {

		return this.height;

	}

	/**
	 * Método toString para imprimir tablero
	 * 
	 * @return cadena con el tablero
	 */
	@Override
	public String toString() {

		String str = "";

		for (int i = 0; i < this.height; i++) {

			for (int j = 0; j < this.width; j++) {

				str += board[i][j];

			}

			str += "\n";

		}

		return str;
	}

	/**
	 * Método toString para imprimir tablero con la bola
	 * 
	 * @return cadena con el tablero con la bola
	 */
	public String toString(int ballX, int ballY) {

		String str = "";

		for (int i = 0; i < this.height; i++) {

			for (int j = 0; j < this.width; j++) {

				if (i == ballY && j == ballX)
					str += 'O';
				else
					str += board[i][j];

			}

			str += "\n";

		}

		return str;
	}

}
