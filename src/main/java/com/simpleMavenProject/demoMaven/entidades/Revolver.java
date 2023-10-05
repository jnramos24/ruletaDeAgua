package com.simpleMavenProject.demoMaven.entidades;

public class Revolver {

	private int posicionActual;
	private int posicionAgua;
	
	public Revolver() {
		
	}

	@Override
	public String toString() {
		return "Revolver [posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + "]";
	}

	public int getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}

	public int getPosicionAgua() {
		return posicionAgua;
	}

	public void setPosicionAgua(int posicionAgua) {
		this.posicionAgua = posicionAgua;
	}
	
	
}
