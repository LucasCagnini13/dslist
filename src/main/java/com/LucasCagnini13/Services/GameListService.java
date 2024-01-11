package com.LucasCagnini13.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LucasCagnini13.Projections.GameMinProjection;
import com.LucasCagnini13.Repositories.GameListRepository;
import com.LucasCagnini13.Repositories.GameRepository;
import com.LucasCagnini13.dto.GameListDto;
import com.LucasCagnini13.dto.GameMinDto;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameListDto> findAll() {
		List<GameListDto> result = gameListRepository.findAll().stream().map(o -> new GameListDto(o)).toList();
		return result;
	}

	public void moveGame(Long listId, int idInicial, int idDestino) {

		List<GameMinProjection> lista = gameRepository.searchByList(listId);

		GameMinProjection obj = lista.remove(idInicial);
		lista.add(idDestino, obj);

		int min = idInicial < idDestino ? idInicial : idDestino;
		int max = idInicial < idDestino ? idDestino : idInicial;

		for (int i = min; i <= max; i++) {

			gameListRepository.updateBelongingPosition(listId, lista.get(i).getId(), i);
		}
	}
}
