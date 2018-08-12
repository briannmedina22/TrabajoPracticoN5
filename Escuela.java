package org.trabajopracticon5.escuela;

import java.util.*;

import javax.persistence.*;


@Entity
public class Escuela {
	
	@ManyToOne
	private org.trabajopracticon5.gestion.Gestion Gestion;
	
	@Column(length=25)
	private String nombre;
	
	@Id
	@Column(length=25)
	private int telefono;
	
	@Column(length=25)
	private String direccion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
