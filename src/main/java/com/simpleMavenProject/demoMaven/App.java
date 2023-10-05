package com.simpleMavenProject.demoMaven;

import java.util.ArrayList;
import java.util.List;

import com.simpleMavenProject.demoMaven.entidades.Juego;
import com.simpleMavenProject.demoMaven.entidades.Jugador;
import com.simpleMavenProject.demoMaven.entidades.Revolver;
import com.simpleMavenProject.demoMaven.servicios.JuegoServicio;
import com.simpleMavenProject.demoMaven.servicios.JuegoServicioImpl;
import com.simpleMavenProject.demoMaven.servicios.RevolverServicio;
import com.simpleMavenProject.demoMaven.servicios.RevolverServicioImpl;

public class App {

	public static void main(String[] args) {

		Juego juego = new Juego();

		Revolver revolver = new Revolver();

		List<Jugador> jugadores = new ArrayList<>();

		JuegoServicio juegoServicio = new JuegoServicioImpl();

		RevolverServicio revolverServicio = new RevolverServicioImpl();

		jugadores.add(new Jugador(1));
		jugadores.add(new Jugador(2));
		jugadores.add(new Jugador(3));
		jugadores.add(new Jugador(4));
		jugadores.add(new Jugador(5));
		jugadores.add(new Jugador(6));

		revolverServicio.llenarRevolver(revolver);

		System.out.println(revolver.toString());
		System.out.println("");

		for (Jugador jugador : jugadores) {
			System.out.println(jugador.toString());
		}
		System.out.println("");

		juegoServicio.llenarJuego(juego, jugadores, revolver);

		System.out.println(juego.toString());
		System.out.println("");

		juegoServicio.ronda(juego);

	}
}
