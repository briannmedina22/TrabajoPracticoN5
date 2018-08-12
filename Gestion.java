package org.trabajopracticon5.gestion;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Gestion<Escuela> {
	
	@OneToMany (mappedBy="Gestion")
	private Escuela Escuela;

	@Id
	@Required
	private int cantdirectivos;

	public int getCantdirectivos() {
		return cantdirectivos;
	}

	public void setCantdirectivos(int cantdirectivos) {
		this.cantdirectivos = cantdirectivos;
	}
	
}
