package org.trabajopracticon5.gimnasio;

import javax.persistence.*;

@Entity
public class Gimnasio {
	
	@ManyToOne
	private org.trabajopracticon5.alumno.Alumno Alumno;
	
	@Id
	private String horario;

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	

}
