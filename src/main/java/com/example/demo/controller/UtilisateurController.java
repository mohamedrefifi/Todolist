package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.ProjetDto;
import com.example.demo.Dto.UtilisateurDto;
import com.example.demo.controller.Api.ProjetApi;
import com.example.demo.controller.Api.UtilisateurApi;
import com.example.demo.service.ProjetService;
import com.example.demo.service.UtilisateurService;

@RestController
public class UtilisateurController implements UtilisateurApi {
	
	
	private UtilisateurService utilisateurService ;
	
	@Autowired
	public UtilisateurController (UtilisateurService utilisateurService)
	{
		this .utilisateurService=utilisateurService;
	}

	@Override
	public UtilisateurDto save(UtilisateurDto dto) {
		return utilisateurService.save(dto);
	}

	@Override
	public Optional<UtilisateurDto> FindById(Integer id) {
		if (id==null)
		{
			return null;
		}
		return utilisateurService.FindById(id);
	}

	@Override
	public List<UtilisateurDto> FindAll() {
		return 
				utilisateurService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
      if(id==null)
      {
    	  return;
      }
      utilisateurService.Delete(id);
	}

	
}
