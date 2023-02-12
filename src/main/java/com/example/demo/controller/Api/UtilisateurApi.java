package com.example.demo.controller.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dto.UtilisateurDto;

public interface UtilisateurApi {


  	@PostMapping(value = "/todolist/utilisateur/save")
  	UtilisateurDto save(@RequestBody UtilisateurDto dto);
	
	@GetMapping(value = "/todolist/utilisateur/find/{id}")
	Optional<UtilisateurDto> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/todolist/utilisateur/find/all")
	List <UtilisateurDto> FindAll();
	
	@DeleteMapping(value = "/todolist/utilisateur/delete/{id}")
	void Delete (@PathVariable("id") Integer id);
}
