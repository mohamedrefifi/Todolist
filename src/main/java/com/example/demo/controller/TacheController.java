package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.ProjetDto;
import com.example.demo.Dto.TacheDto;
import com.example.demo.controller.Api.ProjetApi;
import com.example.demo.controller.Api.TacheApi;
import com.example.demo.service.ProjetService;
import com.example.demo.service.TacheService;

@RestController
public class TacheController implements TacheApi {
	
	
	private TacheService tacheService;
	
	@Autowired
	public TacheController (TacheService projetService)
	{
		this .tacheService=projetService;
	}

	@Override
	public TacheDto save(TacheDto dto) {
		return tacheService.save(dto);
	}

	@Override
	public Optional<TacheDto> FindById(Integer id) {
		if (id==null)
		{
			return null;
		}
		return tacheService.FindById(id);
	}

	@Override
	public List<TacheDto> FindAll() {
		return 
				tacheService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
      if(id==null)
      {
    	  return;
      }
      tacheService.Delete(id);
	}

	
}
