package com.helloworld.basicospring.infra.config;

import com.helloworld.basicospring.controllers.CitaController;
import com.helloworld.basicospring.controllers.impl.CitaControllerImpl;
import com.helloworld.basicospring.infra.readers.ConsoleReader;
import com.helloworld.basicospring.repository.CitaRepository;
import com.helloworld.basicospring.repository.impl.CitaRepositoryMemory;
import com.helloworld.basicospring.services.CitaService;
import com.helloworld.basicospring.services.impl.CitaServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ConfigRepository {

/*
	@Bean
	CitaRepository getCitaRepository(){
		return new CitaRepositoryMemory();
	}
	@Bean
	CitaService getCitaService() {
		return new CitaServiceImpl(getCitaRepository());
	}
	@Bean
	CitaController getCitaController() {
		return new CitaControllerImpl(getCitaService());
	}

	@Bean
	ConsoleReader initConsoleReader(){
		return new ConsoleReader(getCitaController());
	}
*/

}
