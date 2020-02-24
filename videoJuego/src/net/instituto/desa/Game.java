package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	
	public static String getAbajo() {
		return ABAJO;
	}

	public static String getArriba() {
		return ARRIBA;
	}

	public static String getIzquierda() {
		return IZQUIERDA;
	}

	public static String getDerecha() {
		return DERECHA;
	}

	Jugador j;

	public void movimiento(String m) {
		j.right(m);
		j.left(m);
		j.up(m);
		j.down(m);
	}
	
}
