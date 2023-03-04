package com.helloworld.basicospring.repository;

import com.helloworld.basicospring.models.Cita;
import java.util.List;

public interface CitaRepository {

	public void add(Cita cita);
	public void remove(int id);
	public List<Cita> listar();

}
