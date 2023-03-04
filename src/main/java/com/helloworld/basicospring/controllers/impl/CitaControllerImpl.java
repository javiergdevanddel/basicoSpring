package com.helloworld.basicospring.controllers.impl;

import com.helloworld.basicospring.controllers.CitaController;
import com.helloworld.basicospring.models.Cita;
import com.helloworld.basicospring.services.CitaService;

import java.util.List;

public class CitaControllerImpl implements CitaController {

	CitaService citaService;

	public CitaControllerImpl(CitaService citaService) {
		this.citaService = citaService;
	}

	@Override
	public List<Cita> listar() {
		return citaService.listar();
	}

	@Override
	public void alta(Cita cita) {
		citaService.alta(cita);
	}

	@Override
	public void baja(int id) {
		citaService.baja(id);
	}

	@Override
	public boolean comprobarCita(Cita cita) {
		return false;
	}
}
