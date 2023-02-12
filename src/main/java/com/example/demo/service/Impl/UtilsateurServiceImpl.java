package com.example.demo.service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.demo.Dto.UtilisateurDto;
import com.example.demo.model.Utilisateur;
import com.example.demo.repository.UtilisateurRepository;
import com.example.demo.service.UtilisateurService;

@Service
public class UtilsateurServiceImpl implements UtilisateurService{

	private UtilisateurRepository utilisateurRepository ;
	
	public UtilsateurServiceImpl(UtilisateurRepository utilisateurRepository)
	{
		this.utilisateurRepository=utilisateurRepository;
	}
	
	@Override
	public UtilisateurDto save(UtilisateurDto dto) {
		if(dto==null)
		{
			return null;
		}
		
		return UtilisateurDto.fromentity(utilisateurRepository.save(dto.toentity(dto)));
	}

	@Override
	public Optional<UtilisateurDto> FindById(Integer id) {
		
		if (id==null)
		{
			return null;
		}
		Optional<Utilisateur>pOptional=utilisateurRepository.findById(id);
		return
				Optional.of(UtilisateurDto.fromentity(pOptional.get()));
	}

	@Override
	public List<UtilisateurDto> FindAll() {
		
		return
				utilisateurRepository.findAll().stream()
				.map(UtilisateurDto::fromentity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		utilisateurRepository.deleteById(id);
		
	}

}
