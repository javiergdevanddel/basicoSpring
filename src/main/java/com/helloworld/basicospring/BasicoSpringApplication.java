package com.helloworld.basicospring;

import com.helloworld.basicospring.infra.config.ConfigRepository;
import com.helloworld.basicospring.infra.readers.ConsoleReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class BasicoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicoSpringApplication.class, args);
	}
}
