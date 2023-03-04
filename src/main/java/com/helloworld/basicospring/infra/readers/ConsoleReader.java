package com.helloworld.basicospring.infra.readers;

import com.helloworld.basicospring.controllers.CitaController;
import com.helloworld.basicospring.models.Cita;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class ConsoleReader  {

	CitaController citaController;
	SimpleDateFormat fechaFormateador; // = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("es_ES"));

	public ConsoleReader(CitaController citaController){
		this.citaController = citaController;
		fechaFormateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("es_ES"));
	}

	@PostConstruct
	public void init() throws Exception {
		Scanner scanner = new Scanner(System.in);
		int opcion = 1;
		String entradaConsola;
		while(opcion != 0){
			System.out.println("Menu por consola");
			System.out.println("1.- Registrar nueva cita (nombre, apellidos, dd/MM/yyyy HH:mm:ss");
			System.out.println("2.- Borrar una cita (nombre)");
			System.out.println("3.- Listar todas las citas");
			//System.out.println("4.- ");
			System.out.println("0.- Salir.");
			System.out.println("Ingrese la accion a realizar: ");
			entradaConsola = scanner.next();
			try{
				opcion = Integer.parseInt(entradaConsola);
			}catch (Exception e) {
				System.out.println("Opción no valida");
			}
			switch(opcion) {
				case 0:
					System.out.println("Hasta luego!! ");
					break;
				case 1:
					System.out.print("Inserte el nombre: ");
					String nombre = scanner.next();
					System.out.print("Inserte el apellidos: ");
					String apellidos = scanner.next();
					System.out.print("Inserte la fecha dd/MM/yyyy HH:mm:ss ");
					String fecha = scanner.nextLine();

					Date fechaCita; // = new Date();
					try {
						//fechaFormateador.setTimeZone(TimeZone.getTimeZone("UTC+1"));
						fechaCita = fechaFormateador.parse(scanner.nextLine()); // fechaFormateador.parse(fecha);
					} catch (ParseException e) {
						throw new RuntimeException(e);
					}
					citaController.alta(new Cita(nombre, apellidos, fechaCita));
					break;

				case 2:
					System.out.println("Inserte el id de la cita: ");
					String id = scanner.next();
					int idCita = Integer.parseInt(id);
					citaController.baja(idCita);
					break;

				case 3:
					List<Cita> citas = citaController.listar();
					System.out.println("Listado de citas:");
					for (int i = 0; i < citas.size(); i++) {
						Cita cita = citas.get(i);
						System.out.printf("Id : %s, nombre: %s %s, fecha: %s", i, cita.getNombre(), cita.getAppellidos(),fechaFormateador.format(cita.getFecha()));
						System.out.println();
					}
					System.out.println();
					break;
				default:
					System.out.println ("Número no válido");
			}

		}
	}

}
