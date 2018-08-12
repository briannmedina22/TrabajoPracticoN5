package org.trabajopracticon5.programas;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Programas {
	
	@OneToMany
	private org.trabajopracticon5.alumno.Alumno Alumno;

	@Column(length=25)
	private String nombre;
	
    @Id
    @Required
	private String curso;
	
    @Id
    @Required
	private int año;
    
    @Column(length=25)
	private String profesor;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
}
