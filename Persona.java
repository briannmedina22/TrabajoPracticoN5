package org.trabajopracticon5.persona;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Persona {
	
	@ManyToOne
	private org.trabajopracticon5.preceptor.Preceptor Preceptor;
	
	@ManyToOne
	private org.trabajopracticon5.aula.Aula Aula;

	@Column(length=25)
	@Required
	private String nombre;
	
	@Column(length=25)
	private String apellido;
	
	@Id
	@Column(length=11)
	private int dni;
	
	@Id
	private String email;
	
	@Column(length=25)
	private String direccion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

}

