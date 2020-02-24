package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void down(String m) {
		if (m.equalsIgnoreCase(Game.getAbajo())) {
			setY(getY() + 1);
		}
	}

	public void up(String m) {
		if (m.equalsIgnoreCase(Game.getArriba())) {
			setY(getY() - 1);
		}
	}

	public void left(String m) {
		if (m.equalsIgnoreCase(Game.getIzquierda())) {
			setX(getX() - 1);
		}
	}

	public void right(String m) {
		if (m.equalsIgnoreCase(Game.getDerecha())) {
			setX(getX() + 1);
		}
	}

}
