/**
 * 
 */
package com.primefaces.beans;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.primefaces.objets.Etudiant;

/**
 * 
 */
@RequestScoped
@Named
public class EtudiantBean {
	private Etudiant etudiant;
	private List<Etudiant> listeEtudiant;
	private String matricule;
	private String nom;
	private String prenom;
	private Date dateNais;
	
	
	public EtudiantBean() {
		listeEtudiant = new ArrayList<Etudiant>();
		etudiant = new Etudiant();
		
		addEtudiant(new Etudiant("DIOUF", "Serigne Salif", new Date()));
		addEtudiant(new Etudiant("DIOP", "Ndeye Magatte", new Date()));
		addEtudiant(new Etudiant("NDOYE", "Khadim", new Date()));
		addEtudiant(new Etudiant("DIAMANKA", "Diatou", new Date()));
		addEtudiant(new Etudiant("DIOUF", "Fatou kiné", new Date()));
	}
	
	public void addEtudiant(Etudiant e) {
		listeEtudiant.add(e);
	}
	
	
	/**
	 * Une méthode pour suprimer un etudiant
	 * @param id
	 */
	public void deleteEtudiant(int id) {
		System.out.println("supression de l'etudiant: " +id);
	}
	
    
	/**
	 * une méthode pour modifier un etudiant
	 * @param id
	 */
	public void updateEtudiant(int id) {
		System.out.println("mise a jour de l'etudiant: " +id);
	}
	
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}




	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}




	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}




	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}




	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}




	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	/**
	 * @return the dateNais
	 */
	public Date getDateNais() {
		return dateNais;
	}




	/**
	 * @param dateNais the dateNais to set
	 */
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}




	/**
	 * @return the etudiant
	 */
	public Etudiant getEtudiant() {
		return etudiant;
	}
	/**
	 * @param etudiant the etudiant to set
	 */
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	/**
	 * @return the listeEtudiant
	 */
	public List<Etudiant> getListeEtudiant() {
		return listeEtudiant;
	}
	/**
	 * @param listeEtudiant the listeEtudiant to set
	 */
	public void setListeEtudiant(List<Etudiant> listeEtudiant) {
		this.listeEtudiant = listeEtudiant;
	}

	
	
}
