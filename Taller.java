package org.trabajopracticon5.taller;

import javax.persistence.*;

import org.trabajopracticon5.aula.*;

@Entity
public class Taller extends Aula{
  
	@Id
	private int canttaller;

	public int getCanttaller() {
		return canttaller;
	}

	public void setCanttaller(int canttaller) {
		this.canttaller = canttaller;
	}
}
