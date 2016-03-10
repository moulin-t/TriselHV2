/**
 * 
 */
package com.metier;

import javax.persistence.*;

/**
 * @author moulin-t
 *
 */
@Entity
@Table(name="factureFoyer")
@DiscriminatorValue(value="ff")
public class FactureFoyer extends Facture {

	@Column(name="idFoyer")
	private String idFoyer;
	/**
	 * 
	 */
	public FactureFoyer() {
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
	public FactureFoyer(int idF, int anF, int moisF, String nomF, String idFoyer) {
		super(idF, anF, moisF, nomF);
		this.idFoyer = idFoyer;
		// TODO Auto-generated constructor stub
	}
	public FactureFoyer(int anF, int moisF, String nomF, String idFoyer) {
		super(anF, moisF, nomF);
		this.idFoyer = idFoyer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FactureFoyer [idFoyer=" + idFoyer + ", getIdF()=" + getIdF() + ", getAnF()=" + getAnF()
				+ ", getMoisF()=" + getMoisF() + ", getNomF()=" + getNomF() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
