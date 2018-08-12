package org.trabajopracticon5.mtaller;

import javax.persistence.*;

import org.trabajopracticon5.programas.*;

@Entity
public class Mtaller extends Programas {

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
