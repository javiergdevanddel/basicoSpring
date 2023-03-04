package com.helloworld.basicospring.repository.impl;

import com.helloworld.basicospring.models.Cita;
import com.helloworld.basicospring.repository.CitaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CitaRepositoryMemory implements CitaRepository {
	private final List<Cita> citas;

	public CitaRepositoryMemory(){
		citas = new ArrayList<>();
	}

	@Override
	public void add(Cita cita) {
		citas.add(cita);
	}

	@Override
	public void remove(int id) {
		citas.remove(id);
	}

	@Override
	public List<Cita> listar() {
		return citas;
	}
}
