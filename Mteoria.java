package org.trabajopracticon5.mteoria;

import javax.persistence.*;

import org.trabajopracticon5.programas.*;

@Entity
public class Mteoria extends Programas{

	@Id
	@Column(length=25)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
