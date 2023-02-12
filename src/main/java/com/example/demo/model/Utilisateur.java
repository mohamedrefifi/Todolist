package com.example.demo.model;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "Nom")
	private String Nom;
	
	@Column(name = "Prenom")
	private String Prenom;
	
	@Column(name = "Datenaissance")
	private Date Datenaissance;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Motdepasse")
	private String Motdepasse;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Tache>taches ;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Projet>projets ;
	
	
}
