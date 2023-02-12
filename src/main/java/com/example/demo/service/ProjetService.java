package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.ProjetDto;

public interface ProjetService {

	  ProjetDto save(ProjetDto dto);
		
		Optional<ProjetDto> FindById (Integer id);
		
		List <ProjetDto> FindAll();
		
		void Delete (Integer id);
}
