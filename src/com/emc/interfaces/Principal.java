package com.emc.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gos gos = new Gos();
		gos.setNom("Black");
		gos.setEdat(6);
		gos.descripcioAnimal();
		gos.esPerillos();

		// Polimorfisme de interficies
		Animal animal = new Gos();
		// Casting or Downcasting or unboxing or unwrapping
		((Gos) animal).setNom("Black");
		((Gos) animal).setEdat(6);
		animal.descripcioAnimal();

		// animal.esPerillos();
		AkitaInu animal1 = new Gos();
		animal1.esPerillos();

		Animal animal2 = new Gat();

		// Generics (strong typed collections)
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(animal);
		animalList.add(animal2);
		// animalList.add(animal1);

	}

}
