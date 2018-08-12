package org.trabajopracticon5.profesor;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopracticon5.persona.*;

@Entity
public class Profesor extends Persona {
	
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
