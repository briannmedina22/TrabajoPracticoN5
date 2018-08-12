package org.trabajopracticon5.aula;

import javax.persistence.*;

@Entity
public class Aula {
	
	@OneToMany
	private org.trabajopracticon5.persona.Persona Persona;
	
	private int año;
	
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
