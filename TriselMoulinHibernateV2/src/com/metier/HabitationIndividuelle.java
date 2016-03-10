package com.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.*;
@Entity
@Table(name="habitationIndividuelle")
@DiscriminatorValue(value="hi")
public class HabitationIndividuelle extends Habitation {

	@OneToMany
	@JoinColumn(name="idHabitation")
	private List<Facture> lesFactures;
	@ManyToOne
	@JoinColumn(name="idUsager")
	private Usager lUsager;
	
	public HabitationIndividuelle() {
		// TODO Auto-generated constructor stub
	}

	public HabitationIndividuelle(String idHabitation, String adresseRue, String adresseVille) {
		super(idHabitation, adresseRue, adresseVille);
		this.lesFactures = new ArrayList<Facture>();
		// TODO Auto-generated constructor stub
	}

	public List<Facture> getLesFactures() {
		return lesFactures;
	}

	public void setLesFactures(List<Facture> lesFactures) {
		this.lesFactures = lesFactures;
	}

	public Usager getlUsager() {
		return lUsager;
	}

	public void setlUsager(Usager lUsager) {
		this.lUsager = lUsager;
	}

	@Override
	public String toString() {
		return "HabitationIndividuelle [lesFactures=" + lesFactures + ", lUsager=" + lUsager + "]";
	}
}
