package com.example.demo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tache {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "Nom")
	private String Nom;
	
	@Column(name = "Description")
	private String Description;
	
	@Column(name = "DateDebut")
	private Date DateDebut;
	
	@Column(name = "DateFebut")
	private Date DateFebut;
	
	@Column(name = "Etat")
	private String Etat;
	
	@ManyToOne
	@JoinColumn(name = "idutilisateur")
	private Utilisateur utilisateur;
	
	

}
