package com.example.demo.Dto;

import java.util.Date;

import com.example.demo.model.Projet;
import com.example.demo.model.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ProjetDto {

	private Integer Id;
	

	private String Description;

	private Date DateDebut;

	private String Etat;

	private UtilisateurDto utilisateurDto;
	
	
	public static ProjetDto fromentity (Projet projet)
	{
		if (projet==null)
		{
			return null;
		}
		else {
			return ProjetDto.builder()
					.Id(projet.getId())
					.DateDebut(projet.getDateDebut())
					.Description(projet.getDescription())
					.Etat(projet.getEtat())
				     .utilisateurDto(UtilisateurDto.fromentity(projet.getUtilisateur()))
					.build();
		}
	}
	public static Projet toentity(ProjetDto projetDto)
	{
		if(projetDto==null)
		{
			return null;
		}
		else {
			Projet projet = new Projet();
		    projet.setId(projetDto.getId());
		    projet.setDateDebut(projetDto.getDateDebut());
		    projet.setDescription(projetDto.getDescription());
			projet.setEtat(projetDto.getEtat());
			projet.setUtilisateur(UtilisateurDto.toentity(projetDto.getUtilisateurDto()));
			return projet;
		}
	}

}
