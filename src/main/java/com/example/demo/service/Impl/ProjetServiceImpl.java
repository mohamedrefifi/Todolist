package com.example.demo.service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.ProjetDto;
import com.example.demo.model.Projet;
import com.example.demo.repository.ProjetRepository;
import com.example.demo.service.ProjetService;


@Service
public class ProjetServiceImpl implements ProjetService {

	private ProjetRepository projetRepository;
	
	public ProjetServiceImpl (ProjetRepository projetRepository)
	{
		this.projetRepository=projetRepository;
	}
	
	
	@Override
	public ProjetDto save(ProjetDto dto) {
		if(dto==null)
		{
			return null;
		}
		
		return ProjetDto.fromentity(projetRepository.save(dto.toentity(dto)));
	}

	@Override
	public Optional<ProjetDto> FindById(Integer id) {
		
		if (id==null)
		{
			return null;
		}
		Optional<Projet>pOptional=projetRepository.findById(id);
		return
				Optional.of(ProjetDto.fromentity(pOptional.get()));
	}

	@Override
	public List<ProjetDto> FindAll() {
		
		return
				projetRepository.findAll().stream()
				.map(ProjetDto::fromentity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		projetRepository.deleteById(id);
		
	}

}
