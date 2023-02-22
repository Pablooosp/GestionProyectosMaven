package com.utad.dawe.model;

public class JugadorBalonMano {
	private String Nombre;
	private int Dorsal;
	private int Anotacion;
	private int Bloqueo;
	private int TiempoJugado;
	private int[][] estadisticas;
	
	public JugadorBalonMano (String Nombre, int Dorsal) {
		this.Nombre=Nombre;
		this.Dorsal=Dorsal;
		this.estadisticas = new int [10][3];
	}

	public void setAnotacion(int anotacion) {
		Anotacion = anotacion;
	}

	public void setBloqueo(int bloqueo) {
		Bloqueo = bloqueo;
	}

	public void setTiempoJugado(int tiempoJugado) {
		TiempoJugado = tiempoJugado;
	}
	
	public void agregarEstadisticas(int jornada, int anotaciones, int bloqueos, int tiempojugado2) {
		estadisticas[jornada-1][0] = anotaciones;
		estadisticas[jornada-1][1] = bloqueos;
		estadisticas[jornada-1][2] = tiempojugado2;
	}
	
	public String mostrarEstadisticas() {
		int totalanotaciones=0;
		int totalbloqueos=0;
		int totaltiempojugado=0;
		for(int i=0; i<estadisticas.length;i++) {
			totalanotaciones += estadisticas[i][0];
			totalbloqueos += estadisticas[i][1];
			totaltiempojugado += estadisticas[i][2];
		}
		return "Anotaciones totales: "+totalanotaciones+" / Bloqueos totales: "+totalbloqueos+" / TiempoJugado total: "+totaltiempojugado;
	}

	@Override
	public String toString() {
		return "JugadorBalonMano [Nombre=" + Nombre + ", Dorsal=" + Dorsal + ", Anotacion=" + Anotacion + ", Bloqueo="
				+ Bloqueo + ", TiempoJugado=" + TiempoJugado + "]";
	}
	
}
