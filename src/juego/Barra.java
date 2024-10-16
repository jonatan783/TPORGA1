package juego;

import java.awt.Color;

import entorno.Entorno;

public class Barra {
    private double x;
    private double y;
    private double ancho;
    private double alto;
    private Color color;

    // Constructor
    public Barra(double x, double y) {
        this.x = x;
        this.y = y;
        this.ancho = 110;
        this.alto = 10;
        this.color = Color.CYAN;
    }

    // Metodos
    public void dibujar(Entorno e) {
        e.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, this.color);
    }

    public void moverIzquierda() {
        x += -1;
    }

    public void moverDerecha() {
        x += 1;
    }

}
