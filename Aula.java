package org.trabajopracticon5.aula;

import javax.persistence.*;

@Entity
public class Aula {
	
	@OneToMany
	private org.trabajopracticon5.persona.Persona Persona;
	
	private int a�o;
	
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
