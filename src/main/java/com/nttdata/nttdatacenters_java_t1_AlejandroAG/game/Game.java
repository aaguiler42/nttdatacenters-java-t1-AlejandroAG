package com.nttdata.nttdatacenters_java_t1_AlejandroAG.game;

public class Game {

	private boolean finish;
	private Board board;
	private Ball ball;

	public Game() {

		this.finish = false;
		this.board = new Board();
		this.ball = new Ball();

	}

	public int launchAndStart() {

		int result = 0;

		do {

			try {

				Thread.sleep(200);

				this.ball.incrementY(1);

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

				System.out.println(this.board.toString(this.ball.getX(), this.ball.getY()));

				if (this.ball.getY() == this.board.getHeight() - 2) {

					result += -50;
					this.finish = true;

				}

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		} while (!finish);

		return result;
	}

	public String getGamePoints(int points) {
		return "You earn " + points + " points in this round";
	}
}
