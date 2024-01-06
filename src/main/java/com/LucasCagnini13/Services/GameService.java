package com.LucasCagnini13.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LucasCagnini13.Repositories.GameRepository;
import com.LucasCagnini13.dto.GameDto;
import com.LucasCagnini13.dto.GameMinDto;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public List<GameMinDto> findAll() {
		List<GameMinDto> result = gameRepository.findAll().stream().map(o -> new GameMinDto(o)).toList();
		return result;
	}
	
	@Transactional
	public GameDto findById(Long id) {
		
		return new GameDto(gameRepository.getById(id));  
	}
}
