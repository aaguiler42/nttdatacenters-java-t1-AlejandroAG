package com.nttdata.nttdatacenters_java_t1_AlejandroAG.game;

/**
 * Clase juego (Partida)
 * @author Alejandro Aguilera García
 */
public class Game {

	private boolean finish;
	private Board board;
	private Ball ball;

	/**
	 * Constructor de la clase Game
	 */
	public Game() {

		this.finish = false;
		this.board = new Board();
		this.ball = new Ball();

	}

	/**
	* Método que lanza el juego
	* @return puntos obtenidos en la partida
	*/
	public int launchAndStart() {

		int result = 0;

		do {

			// Lanzamiento de la bola y juego de esta pero con retardo
			try {

				Thread.sleep(200);

				this.ball.incrementY(1);

				// Comprobación de colisión
				if (this.board.getCoord(this.ball.getX(), this.ball.getY()) == '\\') {

					result += 20;
					this.ball.incrementX((int) (Math.random() * 4) + 1);

				} else if (this.board.getCoord(this.ball.getX(), this.ball.getY()) == '/') {

					result += 20;
					this.ball.incrementX(-1 * ((int) (Math.random() * 4) + 1));

				} else if (this.board.getCoord(this.ball.getX(), this.ball.getY()) == '-'
						&& this.ball.getY() != this.board.getHeight() - 2) {

					result += 100;
					this.ball.incrementY(-1);
					this.finish = true;

				} else if (this.board.getCoord(this.ball.getX(), this.ball.getY()) == '|') {

					result += 10;
					this.ball.incrementX(Math.random() > 0.5 ? -1 : 1);
					this.ball.incrementY(-1);

				}

				if (this.ball.getY() == this.board.getHeight() - 2) {

					result += -50;
					this.finish = true;

				}

				// Impresion de tablero
				System.out.println(this.board.toString(this.ball.getX(), this.ball.getY()));

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		} while (!finish);

		return result;
	}

	/**
	 * Método que obtiene los puntos obtenidos en la partida
	 * @param points puntos obtenidos en la partida
	 * @return cadena con los puntos obtenidos en la partida
	 */
	public String getGamePoints(int points) {
		return "You earn " + points + " points in this round";
	}
}
