package com.utad.dawe.app;

import com.utad.dawe.model.JugadorBalonMano;

public class Equipo {

	public static void main(String[] args) {
		
		JugadorBalonMano a = new JugadorBalonMano("Fran", 8);
		JugadorBalonMano b = new JugadorBalonMano("Dani", 1);
		
		for(int i=1; i<11; i++) {
			int anotacionesA = (int) (Math.random()*10+0);
			int bloqueosA = (int) (Math.random()*5+0);
			int tiempojugadoA = (int) (Math.random()*60+0);
			int tiempojugadoB = (int) (Math.random()*60+0);
			int anotacionesB = (int) (Math.random()*3+0);
			int bloqueosB = (int) (Math.random()*15+0);
			a.agregarEstadisticas(i, anotacionesA, bloqueosA, tiempojugadoA);
			b.agregarEstadisticas(i, anotacionesB, bloqueosB, tiempojugadoB);
			a.setAnotacion(anotacionesA);
			a.setBloqueo(bloqueosA);
			a.setTiempoJugado(tiempojugadoA);
			b.setAnotacion(anotacionesB);
			b.setBloqueo(bloqueosB);
			b.setTiempoJugado(tiempojugadoB);
			System.out.println("Jornada "+i+": "+a.toString());
			System.out.println("Jornada "+i+": "+b.toString());
			if(i==5 || i==10) {
				System.out.println("***"+a.mostrarEstadisticas()+"***");
				System.out.println("***"+b.mostrarEstadisticas()+"***");
			}
		}
		
		
	}

}
