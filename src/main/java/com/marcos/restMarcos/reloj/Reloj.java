package com.marcos.restMarcos.reloj;

public class Reloj {

	private String nombre;
	private Integer hora;
	private Integer minutos;
	private Integer segundos;
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Integer getMinutos() {
		return minutos;
	}
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}
	public Integer getSegundos() {
		return segundos;
	}
	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}
	@Override
	public String toString() {
		return "\n\nReloj {"
				+ "\n\tnombre=" + nombre + ", "
				+ "\n\thora=" + hora + ", "
				+ "\n\tminutos=" + minutos + ", "
				+ "\n\tsegundos=" + segundos 
				+ "\n}";
	}
	
	
	
	
}
