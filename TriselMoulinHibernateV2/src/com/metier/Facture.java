package com.metier;

import javax.persistence.*;

@Entity
@Table(name="facture")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typeFacture", discriminatorType=DiscriminatorType.STRING)
public class Facture {
	@Id
	@Column(name="idF")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idF;
	@Column(name="anF")
	private int anF;
	@Column(name="moisF")
	private int moisF;
	@Column(name="nomF")
	private String nomF;
	public Facture() {
		super();
	}
	public Facture(int idF, int anF, int moisF, String nomF) {
		super();
		this.idF = idF;
		this.anF = anF;
		this.moisF = moisF;
		this.nomF = nomF;
	}
	public Facture(int anF, int moisF, String nomF) {
		super();
		this.anF = anF;
		this.moisF = moisF;
		this.nomF = nomF;
	}
	public int getIdF() {
		return idF;
	}
	public void setIdF(int idF) {
		this.idF = idF;
	}
	public int getAnF() {
		return anF;
	}
	public void setAnF(int anF) {
		this.anF = anF;
	}
	public int getMoisF() {
		return moisF;
	}
	public void setMoisF(int moisF) {
		this.moisF = moisF;
	}
	public String getNomF() {
		return nomF;
	}
	public void setNomF(String nomF) {
		this.nomF = nomF;
	}
}
