package com.LucasCagnini13.dto;

import java.util.Objects;

import com.LucasCagnini13.Entities.Game;
import com.LucasCagnini13.Entities.GameList;

public class GameListDto {

	private Long id;
	private String name;

	public GameListDto() {
	}

	public GameListDto(GameList entity) {
		super();
		id = entity.getId();
		name = entity.getName();

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
