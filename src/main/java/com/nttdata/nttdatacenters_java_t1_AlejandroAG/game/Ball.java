package com.nttdata.nttdatacenters_java_t1_AlejandroAG.game;

public class Ball {

	private int x;
	private int y;

	public Ball() {
		this.x = (int) (Math.random() * 13) + 1;
		this.y = 1;
	}

	public void incrementY(int n) {
		this.y += n;
	}

	public void incrementX(int n) {
		this.x += n;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
