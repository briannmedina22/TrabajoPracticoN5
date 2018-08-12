package org.trabajopracticon5.preceptor;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Preceptor {
	
	@OneToMany
	private org.trabajopracticon5.persona.Persona Persona;
	

	@Column(length=25)
	@Required
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Id
	private int curso;
}
