package com.example.demo.service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.Dto.TacheDto;
import com.example.demo.model.Projet;
import com.example.demo.model.Tache;
import com.example.demo.repository.ProjetRepository;
import com.example.demo.repository.TacheRepository;
import com.example.demo.service.TacheService;

@Service
public class TacheServiceImpl implements TacheService{
	
	
	private TacheRepository tacheRepository;
	
	public TacheServiceImpl (TacheRepository tacheRepository)
	{
		this.tacheRepository=tacheRepository;
	}
	
	
	@Override
	public TacheDto save(TacheDto dto) {
		if(dto==null)
		{
			return null;
		}
		
		return TacheDto.fromentity(tacheRepository.save(dto.toentity(dto)));
	}

	@Override
	public Optional<TacheDto> FindById(Integer id) {
		
		if (id==null)
		{
			return null;
		}
		Optional<Tache>pOptional=tacheRepository.findById(id);
		return
				Optional.of(TacheDto.fromentity(pOptional.get()));
	}

	@Override
	public List<TacheDto> FindAll() {
		
		return
				tacheRepository.findAll().stream()
				.map(TacheDto::fromentity)
				.collect(Collectors.toList());
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		tacheRepository.deleteById(id);
		
	}

}


