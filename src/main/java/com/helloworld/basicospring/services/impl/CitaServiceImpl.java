package com.helloworld.basicospring.services.impl;

import com.helloworld.basicospring.models.Cita;
import com.helloworld.basicospring.repository.CitaRepository;
import com.helloworld.basicospring.services.CitaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {


	CitaRepository citaRepository;

	public CitaServiceImpl(CitaRepository citaRepository){
		this.citaRepository = citaRepository;
	}
	@Override
	public List<Cita> listar() {
		return citaRepository.listar();
	}

	@Override
	public void alta(Cita cita) {
		citaRepository.add(cita);
	}

	@Override
	public void baja(int id) {
		citaRepository.remove(id);
	}

	@Override
	public boolean comprobarCita(Cita cita) {
		return false;
	}
}
