package com.helloworld.basicospring.infra.config;

import com.helloworld.basicospring.controllers.CitaController;
import com.helloworld.basicospring.controllers.impl.CitaControllerImpl;
import com.helloworld.basicospring.infra.readers.ConsoleReader;
import com.helloworld.basicospring.repository.CitaRepository;
import com.helloworld.basicospring.repository.impl.CitaRepositoryMemory;
import com.helloworld.basicospring.services.CitaService;
import com.helloworld.basicospring.services.impl.CitaServiceImpl;

public class ConfigRepository {

	public static ConsoleReader initConsoleReader(){
		return new ConsoleReader(getCitaController());
	}
	public static CitaController getCitaController() {
		return new CitaControllerImpl(getCitaService());
	}
	static CitaService getCitaService() {
		return new CitaServiceImpl(getCitaRepository());
	}

	static CitaRepository getCitaRepository(){
		return new CitaRepositoryMemory();
	}
}
