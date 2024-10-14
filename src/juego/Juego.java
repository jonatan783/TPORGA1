package juego;

import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;

	// Variables y métodos propios de cada grupo
	private Pelota pelota;

	public Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Titulo de TP - Grupo N - Apellido1 - Apellido2 -Apellido3", 800, 600);

		// Inicializar lo que haga falta para el juego
		pelota = new Pelota(entorno.ancho() / 2, entorno.alto() / 2);

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y por lo
	 * tanto es el método más importante de esta clase. Aquí se debe actualizar el
	 * estado interno del juego para simular el paso del tiempo (ver el enunciado
	 * del TP para mayor detalle).
	 */
	public void tick() {
		// Procesamiento de un instante de tiempo
		pelota.dibujar(entorno);
		pelota.mover();

		if (pelota.chocoConBorde(entorno)) {
			pelota.rebotar(entorno);
		}

		if (entorno.estaPresionada(entorno.TECLA_ESPACIO)) {
			entorno.colorFondo(Color.BLUE);
		} else {
			entorno.colorFondo(Color.BLACK);
		}

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}
}
