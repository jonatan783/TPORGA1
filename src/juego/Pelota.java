package juego;

import java.awt.Color;

import entorno.Entorno;

public class Pelota {
	//Variables de instancia
	private double x;
	private double y;
	private double diametro;
	private double angulo;
	private Color color;
	
//	Constructor
	public Pelota(double x, double y) {
		this.x = x;
		this.y = y;
		this.angulo = Math.PI/3;
		this.diametro = 100;
		this.color = Color.CYAN;
	}
	
//	Metodos
	public void dibujar(Entorno e) {
		e.dibujarCirculo(x, y, diametro, color);
	}
	
	public void mover() {
		x+= Math.cos(angulo);
		y+= Math.sin(angulo);
	}
	
	public void rebotar(Entorno e) {
		if(y - diametro/2 < 0 || y+diametro/2 > e.alto()) {
			angulo = -angulo;
		} else {
			angulo = Math.PI - angulo;	
			
		}
	
		
	}

	public boolean chocoConBorde(Entorno entorno) {
		if(x - diametro/2 < 0 || x+diametro/2 > entorno.ancho()) {
			return true; 
		}
		if(y - diametro/2 < 0 || y+diametro/2 > entorno.alto()) {
			return true; 
		}
		return false;
	}
	
	
	
	

	
	
	

}
