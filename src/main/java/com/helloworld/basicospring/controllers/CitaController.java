package com.helloworld.basicospring.controllers;

import com.helloworld.basicospring.models.Cita;

import java.util.List;

public interface CitaController {
	List<Cita> listar();
	void alta(Cita cita);
	void baja(int id);
	boolean comprobarCita(Cita cita);
}
