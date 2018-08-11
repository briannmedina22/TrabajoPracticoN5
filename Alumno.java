package org.trabajopracticon5.alumno;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopracticon5.persona.*;

@Entity
public class Alumno extends Persona {
	
	@ManyToOne
	private org.trabajopracticon5.programas.Programas Programas;
	
	@OneToMany
	private org.trabajopracticon5.gimnasio.Gimnasio Gimnasio;
	
	@Id
	@Required
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
