package com.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author moulin-t
 * @version 1.0
 */
@Entity
@Table(name="habitation")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typeHabitation", discriminatorType=DiscriminatorType.STRING)
public class Habitation {
	//Propri�t�s
	@Id
	@Column(name="idHabitation")
	private String idHabitation;
	@Column(name="adresseRue")
	private String adresseRue;
	@Column(name="adresseVille")
	private String adresseVille;
	@OneToMany
	@JoinColumn(name="idHabitation")
	private List<Poubelle> lesPoubelles;
	@OneToMany
	@JoinColumn(name="idHabitation")
	private List<Foyer> lesFoyers;
	//Constructeurs
	public Habitation(){
		super();
	}
	/**
	 * Retourne une habitation
	 * @param idHabitation
	 * @param adresseRue
	 * @param codePostal
	 * @param adresseVille
	 */
	public Habitation(String idHabitation, String adresseRue, String adresseVille) {
		super();
		this.idHabitation = idHabitation;
		this.adresseRue = adresseRue;
		this.adresseVille = adresseVille;
		lesPoubelles = new ArrayList<Poubelle>();
		lesFoyers = new ArrayList<Foyer>();
	}
	//Acesseurs Modificateur
	/**
	 * Retourne l'identifiant de l'habitation
	 * @return idHabitation
	 */
	public String getIdHabitation() {
		return idHabitation;
	}
	/**
	 * Modifie l'identifiant de l'habitation
	 * @param idHabitation
	 */
	public void setIdHabitation(String idHabitation) {
		this.idHabitation = idHabitation;
	}
	/**
	 * Retourne l'adresse de l'habitation (rue)
	 * @return adresseRue
	 */
	public String getAdresseRue() {
		return adresseRue;
	}
	/**
	 * Modifie l'adresse de l'habitation (rue)
	 * @param adresseRue
	 */
	public void setAdresseRue(String adresseRue) {
		this.adresseRue = adresseRue;
	}
	/**
	 * Retourne l'adresse de l'habitation (ville)
	 * @return adresseVille
	 */
	public String getAdresseVille() {
		return adresseVille;
	}
	/**
	 * Modifie l'adresse de l'habitation (ville)
	 * @param adresseVille
	 */
	public void setAdresseVille(String adresseVille) {
		this.adresseVille = adresseVille;
	}
	/**
	 * Retourne la liste des poubelles de l'habitation
	 * @return lesPoubelles
	 */
	public List<Poubelle> getLesPoubelles() {
		return lesPoubelles;
	}
	/**
	 * Modifie la liste des poubelles de l'habitation
	 * @param lesPoubelles
	 */
	public void setLesPoubelles(ArrayList<Poubelle> lesPoubelles) {
		this.lesPoubelles = lesPoubelles;
	}
	/**
	 * Ajoute une poubelle dans la liste des poubelles de l'habitation
	 * @param unePoubelle
	 */
	public void ajoutPoubelle(Poubelle unePoubelle){
		this.lesPoubelles.add(unePoubelle);
	}
	public void setLesPoubelles(List<Poubelle> lesPoubelles) {
		this.lesPoubelles = lesPoubelles;
	}
	@Override
	public String toString() {
		return "Habitation [idHabitation=" + idHabitation + ", adresseRue=" + adresseRue + ", adresseVille="
				+ adresseVille + ", lesPoubelles=" + lesPoubelles + ", lesFoyers=" + lesFoyers + "]";
	}
	/**
	 * Retourne le coût des déchéts pour une poubelle et un mois d'une année
	 * @param an
	 * @param mois
	 */
	public double getCout(int an, int mois){
		double cout = 0;
		for(Poubelle p : lesPoubelles){
			cout = cout + p.getCout(an, mois);
		}
		return cout;
	}
}
