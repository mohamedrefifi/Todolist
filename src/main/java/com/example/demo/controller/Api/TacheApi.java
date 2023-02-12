package com.example.demo.controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.TacheDto;

@CrossOrigin("http://localhost:3000")
public interface TacheApi {

	
      	@PostMapping(value = "/todolist/tache/save")
	     TacheDto save(@RequestBody TacheDto dto);
		
    	@GetMapping(value = "/todolist/tache/find/{id}")
		Optional<TacheDto> FindById (@PathVariable("id") Integer id);
		
    	@GetMapping(value = "/todolist/tache/find/all")
		List <TacheDto> FindAll();
		
    	@DeleteMapping(value = "/todolist/tache/delete/{id}")
		void Delete (@PathVariable("id") Integer id);
}
