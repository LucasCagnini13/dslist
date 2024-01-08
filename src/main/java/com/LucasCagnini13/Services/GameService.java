package com.LucasCagnini13.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LucasCagnini13.Projections.GameMinProjection;
import com.LucasCagnini13.Repositories.GameRepository;
import com.LucasCagnini13.dto.GameDto;
import com.LucasCagnini13.dto.GameMinDto;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameMinDto> findAll() {
		List<GameMinDto> result = gameRepository.findAll().stream().map(o -> new GameMinDto(o)).toList();
		return result;
	}
	
	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		
		return new GameDto(gameRepository.getById(id));  
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findGamesByList(Long idList) {
		
		List<GameMinProjection> GamesList = gameRepository.searchByList(idList);
		List<GameMinDto> result = GamesList.stream().map(o -> new GameMinDto(o)).toList();
		return result;
		
	}
}
