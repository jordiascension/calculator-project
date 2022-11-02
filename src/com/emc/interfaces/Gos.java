package com.emc.interfaces;

public class Gos extends MyAbstractClass implements Animal, AkitaInu {

	String nom;
	int edat;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public Gos() {

	}

	public Gos(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}

	@Override
	public void descripcioAnimal() {
		// TODO Auto-generated method stub
		System.out.println("Nom: " + nom + " edat " + edat);
	}

	@Override
	public boolean esPerillos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

}
