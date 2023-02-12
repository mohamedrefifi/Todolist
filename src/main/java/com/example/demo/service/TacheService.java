package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.TacheDto;

public interface TacheService {


	  TacheDto save(TacheDto dto);
		
		Optional<TacheDto> FindById (Integer id);
		
		List <TacheDto> FindAll();
		
		void Delete (Integer id);
}
