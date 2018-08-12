package org.trabajopracticon5.teoria;

import javax.persistence.*;

import org.trabajopracticon5.aula.*;

@Entity
public class Teoria  extends Aula{
	
	@Id
	private int cantteoria;

	public int getCantteoria() {
		return cantteoria;
	}

	public void setCantteoria(int cantteoria) {
		this.cantteoria = cantteoria;
	}

}
