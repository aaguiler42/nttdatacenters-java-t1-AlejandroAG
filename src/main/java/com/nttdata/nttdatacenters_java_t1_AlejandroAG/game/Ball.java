package com.nttdata.nttdatacenters_java_t1_AlejandroAG.game;

/**
 * Clase board (bola)
 * @author Alejandro Aguilera García
 */
public class Ball {

	private int x;
	private int y;

	/**
	 * Constructor de la clase Ball
	 */
	public Ball() {
		this.x = (int) (Math.random() * 13) + 1;
		this.y = 1;
	}

	/**
	 * Método para incremetar la Y
	 */
	public void incrementY(int n) {
		this.y += n;
	}

	/**
	 * Método para incrementar la X
	 */
	public void incrementX(int n) {
		this.x += n;
	}

	/**
	 * Método para obtener la X
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Método para obtener la Y
	 * @return y
	 */	
	public int getY() {
		return y;
	}

}
