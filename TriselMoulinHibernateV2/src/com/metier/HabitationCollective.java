package com.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="habitationCollective")
@DiscriminatorValue(value="hc")
public class HabitationCollective extends Habitation {
	
	@OneToMany
	@JoinColumn(name="idHabitation")
	private List<Foyer> lesFoyers;
	
	public HabitationCollective() {
		// TODO Auto-generated constructor stub
	}

	public HabitationCollective(String idHabitation, String adresseRue, String adresseVille) {
		super(idHabitation, adresseRue, adresseVille);
		this.lesFoyers = new ArrayList<Foyer>();
		// TODO Auto-generated constructor stub
	}

	public List<Foyer> getLesFoyers() {
		return lesFoyers;
	}

	public void setLesFoyers(List<Foyer> lesFoyers) {
		this.lesFoyers = lesFoyers;
	}

	@Override
	public String toString() {
		return "HabitationCollective [lesFoyers=" + lesFoyers + ", getIdHabitation()=" + getIdHabitation()
				+ ", getAdresseRue()=" + getAdresseRue() + ", getAdresseVille()=" + getAdresseVille()
				+ ", getLesPoubelles()=" + getLesPoubelles() + "]";
	}

}
