package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.ProjetDto;
import com.example.demo.controller.Api.ProjetApi;
import com.example.demo.service.ProjetService;

@RestController
public class ProjetController implements ProjetApi {
	
	
	private ProjetService projetService;
	
	@Autowired
	public ProjetController (ProjetService projetService)
	{
		this .projetService=projetService;
	}

	@Override
	public ProjetDto save(ProjetDto dto) {
		return projetService.save(dto);
	}

	@Override
	public Optional<ProjetDto> FindById(Integer id) {
		if (id==null)
		{
			return null;
		}
		return projetService.FindById(id);
	}

	@Override
	public List<ProjetDto> FindAll() {
		return 
				projetService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
      if(id==null)
      {
    	  return;
      }
      projetService.Delete(id);
	}

	
}
