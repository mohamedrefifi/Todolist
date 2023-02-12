package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.Dto.UtilisateurDto;

public interface UtilisateurService {

	

	  UtilisateurDto save(UtilisateurDto dto);
		
		Optional<UtilisateurDto> FindById (Integer id);
		
		List <UtilisateurDto> FindAll();
		
		void Delete (Integer id);
}
