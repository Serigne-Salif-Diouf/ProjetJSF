/**
 * 
 */
package com.primefaces.objets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 */
public class Etudiant {
	private static int num = 0;
	private int id = 0;
	private String matricule;
	private String nom;
	private String prenom;
	private Date dateNais;
	private String motivation;
	private List<String> images;
	private String couleur;
	


	

	/**
	 * @param nom
	 * @param prenom
	 * @param dateNais
	 */
	public Etudiant(String nom, String prenom, Date dateNais) {
		super();
		num += 1;
		id = num;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}


	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public Etudiant() {
    	images = new ArrayList<String>();   	
    	images.add("img0.jpg");
    	images.add("img1.jpg");
    	images.add("img2.jpg");
    	images.add("img3.jpg");
    	images.add("img4.jpg");
    	images.add("logo xb.png");
		
	}
		
	
	/**
	 * @return the images
	 */
	public List<String> getImages() {
		return images;
	}


	/**
	 * @param images the images to set
	 */
	public void setImages(List<String> images) {
		this.images = images;
	}


	/**
	 * @return the motivation
	 */
	public String getMotivation() {
		return motivation;
	}


	/**
	 * @param motivation the motivation to set
	 */
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	
	/**
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param dateNais
	 */
	public Etudiant(String matricule, String nom, String prenom, Date dateNais) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
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
	
	

}
