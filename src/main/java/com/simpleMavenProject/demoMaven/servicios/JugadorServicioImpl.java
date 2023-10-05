package com.simpleMavenProject.demoMaven.servicios;

import com.simpleMavenProject.demoMaven.entidades.Jugador;
import com.simpleMavenProject.demoMaven.entidades.Revolver;

public class JugadorServicioImpl implements JugadorServicio {
	
	RevolverServicio revolverServicio = new RevolverServicioImpl();

	@Override
	public boolean disparo(Revolver revolver, Jugador jugador) {
		
		System.out.println("El" + jugador.getNombre() + " se apunta");
		
		if(revolverServicio.mojar(revolver)) {
			jugador.setMojado(true);
			System.out.println("El " + jugador.getNombre() + " se mojo");
		} else {
			System.out.println("El " + jugador.getNombre() + " safo");
		}
		
		return !jugador.getMojado();
	}

}
