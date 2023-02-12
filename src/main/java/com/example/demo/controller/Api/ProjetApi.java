package com.example.demo.controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.ProjetDto;

@CrossOrigin("http://localhost:3000")
public interface ProjetApi {

	
      	@PostMapping(value = "/todolist/projet/save")
	    ProjetDto save(@RequestBody ProjetDto dto);
		
    	@GetMapping(value = "/todolist/projet/find/{id}")
		Optional<ProjetDto> FindById (@PathVariable("id") Integer id);
		
    	@GetMapping(value = "/todolist/projet/find/all")
		List <ProjetDto> FindAll();
		
    	@DeleteMapping(value = "/todolist/projet/delete/{id}")
		void Delete (@PathVariable("id") Integer id);
}
