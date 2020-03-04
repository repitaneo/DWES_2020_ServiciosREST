package com.marcos.restMarcos.datos.cines;

public class Sala {

	
	private int numero;
	private int capacidad;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	@Override
	public String toString() {
		return "\n\t\tSala {"
				+ "\n\t\tnumero=" + numero + ", "
				+ "\n\t\tcapacidad=" + capacidad + "]";
	}
	
	
	
}
