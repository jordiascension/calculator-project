package com.emc.inheritance;

public class Principal {

	public static void main(String[] Args) {

		// La primera vez que llamas a profesor1 se crea la clase en memoria ram
		Profesor profesor1 = new Profesor("Juan", "Hernández García", 33);

		// La primera vez que llamas al método estáticos se crea la clase en
		// memoria ram
		Profesor.incrementarContadorProfesores();

		profesor1.setIdProfesor("Prof 22-387-11");

		profesor1.mostrarNombreApellidosYCarnet();
	}

}
