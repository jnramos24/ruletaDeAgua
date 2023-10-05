package com.simpleMavenProject.demoMaven.servicios;

import java.util.List;

import com.simpleMavenProject.demoMaven.entidades.Juego;
import com.simpleMavenProject.demoMaven.entidades.Jugador;
import com.simpleMavenProject.demoMaven.entidades.Revolver;

public interface JuegoServicio {

	public void llenarJuego(Juego juego ,List<Jugador> jugadores, Revolver revolver);

	public void ronda(Juego juego);

}
