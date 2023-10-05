package com.simpleMavenProject.demoMaven.servicios;

import com.simpleMavenProject.demoMaven.entidades.Revolver;

public interface RevolverServicio {
	
	public void llenarRevolver(Revolver revolver);
	
	public Boolean mojar(Revolver revolver);
	
	public void siguienteChorro(Revolver revolver);
	
	public int generarPosicionAleatoria();

}
