package com.helloworld.basicospring.models;

import java.util.Date;

public class Cita {

	public String getNombre() {
		return nombre;
	}

	public String getAppellidos() {
		return appellidos;
	}

	public Date getFecha() {
		return fecha;
	}

	public Cita(String nombre, String appellidos, Date fecha) {
		this.nombre = nombre;
		this.appellidos = appellidos;
		this.fecha = fecha;
	}

	private String nombre;
	private String appellidos;
	private Date fecha;
}
