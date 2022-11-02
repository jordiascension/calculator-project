package com.emc.inheritance;

public class Profesor extends Persona {

	// Ejemplo de inicializador estático

	static int contadorProfesores;
	static {
		contadorProfesores = 0;
		System.out.println("STATIC BLOCK");
	}

	public static void incrementarContadorProfesores() {
		contadorProfesores++;
	}
	// Campos específicos de la subclase.

	private String idProfesor;

	// Constructor de la subclase: incluimos como parámetros al menos los del
	// constructor de la superclase

	public Profesor(String nombre, String apellidos, int edad) {

		super(nombre, apellidos, edad);

		idProfesor = "Unknown";
		incrementarContadorProfesores();
	} // Cierre del constructor

	// Métodos específicos de la subclase

	public void setIdProfesor(String IdProfesor) {
		this.idProfesor = IdProfesor;
	}

	public String getIdProfesor() {
		return idProfesor;
	}

	public void mostrarNombreApellidosYCarnet() {

		// nombre = "Paco"; Si tratáramos de acceder directamente a un campo
		// privado de la superclase, salta un error

		// Sí podemos acceder a variables de instancia a través de los métodos
		// de acceso públicos de la superclase

		System.out.println(
				"Profesor de nombre: " + getNombre() + " " + getApellidos() +

						" con Id de profesor: " + getIdProfesor());
	}
}
