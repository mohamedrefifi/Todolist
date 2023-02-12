package com.example.demo.Dto;
import java.util.Date;
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
public class TacheDto {

	private Integer Id;

	private String Nom;

	private String Description;

	private Date DateDebut;
	
	private Date DateFebut;
	
	private String Etat;
	
	private UtilisateurDto utilisateur;
	
	public static TacheDto fromentity (Tache tache)
	{
		if(tache==null)
		{
			return null;
		}
		else 
			{
				return TacheDto.builder()
						.DateDebut(tache.getDateDebut())
						.DateFebut(tache.getDateFebut())
						.Description(tache.getDescription())
						.Etat(tache.getEtat())
						.Id(tache.getId())
						.utilisateur(UtilisateurDto.fromentity(tache.getUtilisateur()))
						.build();
						
			}
		
	}
		public static Tache toentity (TacheDto tachedto)
		{
			if (tachedto==null)
			{
				return null;
			}
			else {
				Tache tache = new Tache();
				tache.setDateDebut(tachedto.getDateDebut());
				tache.setDateFebut(tachedto.getDateFebut());
				tache.setDescription(tachedto.getDescription());
				tache.setEtat(tachedto.getEtat());
				tache.setId(tachedto.getId());
				tache.setNom(tachedto.getNom());
				tache.setUtilisateur(UtilisateurDto.toentity(tachedto.getUtilisateur()));
				return tache;
			}
		}
	}

