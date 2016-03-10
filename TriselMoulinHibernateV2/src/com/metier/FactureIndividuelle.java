/**
 * 
 */
package com.metier;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author moulin-t
 *
 */
@Entity
@Table(name="factureIndividuelle")
@DiscriminatorValue(value="fi")
public class FactureIndividuelle extends Facture {
	@Column(name="idFoyer")
	private String idHabitation;
	/**
	 * 
	 */
	public FactureIndividuelle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idF
	 * @param anF
	 * @param moisF
	 * @param nomF
	 * @param idHabitation
	 * @param typeFacture
	 * @param idFoyer
	 */
	public FactureIndividuelle(int idF, int anF, int moisF, String nomF, String idHabitation) {
		super(idF, anF, moisF, nomF);
		this.idHabitation = idHabitation;
		// TODO Auto-generated constructor stub
	}
	public FactureIndividuelle(int anF, int moisF, String nomF, String idFoyer) {
		super(anF, moisF, nomF);
		this.idHabitation = idFoyer;
		// TODO Auto-generated constructor stub
	}

	public String getIdHabitation() {
		return idHabitation;
	}

	public void setIdHabitation(String idHabitation) {
		this.idHabitation = idHabitation;
	}

	@Override
	public String toString() {
		return "FactureIndividuelle [idHabitation=" + idHabitation + ", getIdF()=" + getIdF() + ", getAnF()=" + getAnF()
				+ ", getMoisF()=" + getMoisF() + ", getNomF()=" + getNomF() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
