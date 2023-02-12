package com.example.demo.Dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.Projet;
import com.example.demo.model.Tache;
import com.example.demo.model.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UtilisateurDto {
	
	private Integer Id;

	private String Nom;

	private String Prenom;

	private Date Datenaissance;

	private String Email;
	
	private String Motdepasse;

	
	private List<TacheDto>tachesdto ;

	private List<ProjetDto>projetsdto ;
	
	public static UtilisateurDto fromentity (Utilisateur utilisateur)
	{
		if (utilisateur==null)
		{
			return null;
		}
		else {
			
				return UtilisateurDto.builder()
						.Datenaissance(utilisateur.getDatenaissance())
						.Email(utilisateur.getEmail())
						.Id(utilisateur.getId())
						.Motdepasse(utilisateur.getMotdepasse())
						.Nom(utilisateur.getNom())
						.Prenom(utilisateur.getNom())
						.projetsdto(utilisateur.getProjets().stream()
								.map(ProjetDto::fromentity)
								.collect(Collectors.toList())
								)
						.tachesdto(utilisateur.getTaches().stream()
								.map(TacheDto::fromentity)
								.collect(Collectors.toList())
								
								)
						.build();
			}
		
	}
	
	public static Utilisateur toentity (UtilisateurDto utilisateurDto)
	{
	if(utilisateurDto==null)
	{
		return null;
	} 
	else {
		Utilisateur utilisateur = new Utilisateur();
		
		utilisateur.setDatenaissance(utilisateurDto.getDatenaissance());
		utilisateur.setEmail(utilisateurDto.getEmail());
		utilisateur.setId(utilisateurDto.getId());
		utilisateur.setMotdepasse(utilisateurDto.getMotdepasse());
		utilisateur.setNom(utilisateurDto.getNom());
		utilisateur.setPrenom(utilisateurDto.getPrenom());
		utilisateur.setProjets(utilisateurDto.getProjetsdto().stream()
				.map(ProjetDto::toentity)
				.collect(Collectors.toList())
				);
		utilisateur.setTaches(utilisateurDto.getTachesdto().stream()
				.map(TacheDto::toentity)
				.collect(Collectors.toList())
				);
		
		return utilisateur;
	}
	}
}
