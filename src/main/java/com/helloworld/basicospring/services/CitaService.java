package com.helloworld.basicospring.services;

import com.helloworld.basicospring.models.Cita;

import java.util.List;

public interface CitaService {

	List<Cita> listar();
	void alta(Cita cita);
	void baja(int id);
	boolean comprobarCita(Cita cita);
}
