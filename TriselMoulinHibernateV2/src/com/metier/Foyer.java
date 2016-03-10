package com.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="foyer")
public class Foyer {
	@Id
	@Column(name="idFoyer")
	private String idFoyer;
	@Column(name="nbPersonnes")
	private int nbPersonne;
	@OneToMany
	@JoinColumn(name="idFoyer")
	private List<FactureFoyer> lesFacturesFoyer;
	@ManyToOne
	@JoinColumn(name="idHabitation")
	private HabitationCollective lHabitationCollective;
	@Column(name="idUsager")
	private String idUsager;
	public Foyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Foyer(String idFoyer, int nbPersonne, String idUsager) {
		super();
		this.idFoyer = idFoyer;
		this.nbPersonne = nbPersonne;
		this.lesFacturesFoyer = new ArrayList<FactureFoyer>();
		lHabitationCollective = new HabitationCollective();
		this.idUsager = idUsager;
	}
	public String getIdFoyer() {
		return idFoyer;
	}
	public void setIdFoyer(String idFoyer) {
		this.idFoyer = idFoyer;
	}
	public int getNbPersonne() {
		return nbPersonne;
	}
	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}
	public List<FactureFoyer> getLesFacturesFoyer() {
		return lesFacturesFoyer;
	}
	public void setLesFacturesFoyer(List<FactureFoyer> lesFacturesFoyer) {
		this.lesFacturesFoyer = lesFacturesFoyer;
	}
	public HabitationCollective getlHabitationCollective() {
		return lHabitationCollective;
	}
	public void setlHabitationCollective(HabitationCollective lHabitationCollective) {
		this.lHabitationCollective = lHabitationCollective;
	}
	public String getIdUsager() {
		return idUsager;
	}
	public void setIdUsager(String idUsager) {
		this.idUsager = idUsager;
	}
	@Override
	public String toString() {
		return "Foyer [idFoyer=" + idFoyer + ", nbPersonne=" + nbPersonne + ", lesFacturesFoyer=" + lesFacturesFoyer
				+ ", lHabitationCollective=" + lHabitationCollective + ", idUsager=" + idUsager + "]";
	}
}
