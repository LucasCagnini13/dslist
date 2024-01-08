package com.LucasCagnini13.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LucasCagnini13.Repositories.GameListRepository;
import com.LucasCagnini13.Repositories.GameRepository;
import com.LucasCagnini13.dto.GameListDto;
import com.LucasCagnini13.dto.GameMinDto;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDto> findAll() {
		List<GameListDto> result = gameListRepository.findAll().stream().map(o -> new GameListDto(o)).toList();
		return result;
	}
}
