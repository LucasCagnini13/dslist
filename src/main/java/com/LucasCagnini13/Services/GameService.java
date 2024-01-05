package com.LucasCagnini13.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LucasCagnini13.Repositories.GameRepository;
import com.LucasCagnini13.dto.GameMinDto;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDto> findAll() {
		List<GameMinDto> result = gameRepository.findAll().stream().map(o -> new GameMinDto(o)).toList();
		return result;
	}
}
