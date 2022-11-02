package com.emc.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija
	// a la que pertenezca el objeto

	// Polimorfismo de interfaces
	public static List<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		// Polimorfismo de clases
		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque",
				60, 28489);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6,
				"Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41,
				"Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		StringBuilder concentracionSb = new StringBuilder();
		System.out.println(
				"Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(
					concentracionSb.append(integrante.getNombre()).append(" ")
							.append(integrante.getApellidos()).append(" -> "));
			integrante.concentrarse();
		}

		// Programación funcional (mismo ejemplo que tenemos arriba)
		StringBuilder concentracionForeachSb = new StringBuilder();
		integrantes.forEach((integrante) -> {
			System.out.print(concentracionForeachSb
					.append(integrante.getNombre()).append(" ")
					.append(integrante.getApellidos()).append(" -> "));
			integrante.concentrarse();
		});

		// VIAJE
		StringBuilder viajeSb = new StringBuilder();
		System.out.println(
				"\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(viajeSb.append(integrante.getNombre()).append(" ")
					.append(integrante.getApellidos()).append(" -> "));
			integrante.viajar();
		}

		// ENTRENAMIENTO
		StringBuilder entrenamientoSb = new StringBuilder();
		System.out.println(
				"\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(
					entrenamientoSb.append(integrante.getNombre()).append(" ")
							.append(integrante.getApellidos()).append(" -> "));
			integrante.entrenamiento();
		}

		// PARTIDO DE FUTBOL
		StringBuilder partidoSb = new StringBuilder();
		System.out.println(
				"\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out
					.print(partidoSb.append(integrante.getNombre()).append(" ")
							.append(integrante.getApellidos()).append(" -> "));
			integrante.partidoFutbol();
		}

		// PLANIFICAR ENTRENAMIENTO
		StringBuilder planificarSb = new StringBuilder();
		System.out.println(
				"\nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
		System.out.print(planificarSb.append(delBosque.getNombre()).append(" ")
				.append(delBosque.getApellidos()).append(" -> "));
		((Entrenador) delBosque).planificarEntrenamiento();

		// ENTREVISTA
		StringBuilder entrevistaSb = new StringBuilder();
		System.out.println(
				"\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
		System.out.print(entrevistaSb.append(iniesta.getNombre()).append(" ")
				.append(iniesta.getApellidos()).append(" -> "));
		((Futbolista) iniesta).entrevista();

		// MASAJE
		StringBuilder masajeSb = new StringBuilder();
		System.out.println(
				"\nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(masajeSb.append(raulMartinez.getNombre()).append(" ")
				.append(raulMartinez.getApellidos()).append(" -> "));
		((Masajista) raulMartinez).darMasaje();

	}
}
