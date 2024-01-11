package com.LucasCagnini13.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LucasCagnini13.Services.GameListService;
import com.LucasCagnini13.Services.GameService;
import com.LucasCagnini13.dto.GameListDto;
import com.LucasCagnini13.dto.GameMinDto;
import com.LucasCagnini13.dto.ReplacementDto;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDto> findAll() {

		return gameListService.findAll();
	}
	
	@GetMapping(value = "{idList}/games")
	public List<GameMinDto> findGamesByList(@PathVariable Long idList) {
		return gameService.findGamesByList(idList);
	}
	
	@PostMapping(value = "{idList}/replacement")
	public void findGamesByList(@PathVariable Long idList, @RequestBody ReplacementDto body ) {
		 gameListService.moveGame(idList, body.getSourceIndex(), body.getDestinyIndex());
	}

}
