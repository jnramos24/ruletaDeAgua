package com.simpleMavenProject.demoMaven.servicios;

import com.simpleMavenProject.demoMaven.entidades.Revolver;

public class RevolverServicioImpl implements RevolverServicio {

	@Override
	public void llenarRevolver(Revolver revolver) {
		
		revolver.setPosicionActual(generarPosicionAleatoria());
		revolver.setPosicionAgua(generarPosicionAleatoria());
		
	}

	@Override
	public Boolean mojar(Revolver revolver) {
		Boolean exito = false;
		
		if(revolver.getPosicionActual() == revolver.getPosicionAgua()){
			exito = true;
		}
		
		siguienteChorro(revolver);
		return exito;
	}

	@Override
	public void siguienteChorro(Revolver revolver) {
		
		if(revolver.getPosicionActual() == 6) {
			revolver.setPosicionActual(1);
		} else {
			revolver.setPosicionActual(revolver.getPosicionActual()+1);
		}
		
	}

	@Override
	public int generarPosicionAleatoria() {
		int num = (int) Math.floor((Math.random() * 6) + 1); 
		return num;
		
	}


}
