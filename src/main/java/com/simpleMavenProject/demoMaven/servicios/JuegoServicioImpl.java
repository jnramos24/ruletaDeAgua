package com.simpleMavenProject.demoMaven.servicios;

import java.util.List;

import com.simpleMavenProject.demoMaven.entidades.Juego;
import com.simpleMavenProject.demoMaven.entidades.Jugador;
import com.simpleMavenProject.demoMaven.entidades.Revolver;

public class JuegoServicioImpl implements JuegoServicio {

	JugadorServicio jugadorServicio = new JugadorServicioImpl();

	@Override
	public void llenarJuego(Juego juego, List<Jugador> jugadores, Revolver revolver) {

		juego.setJugadores(jugadores);
		juego.setRevolver(revolver);

	}

	@Override
	public void ronda(Juego juego) {
		Boolean bandera = true;

		while (bandera) {
			for (Jugador jugador : juego.getJugadores()) {
				bandera = jugadorServicio.disparo(juego.getRevolver(), jugador);

				if (jugador.getMojado()) {
					System.out.println("Se termino el juego");
					break;
				}

			}
		}

	}

}
