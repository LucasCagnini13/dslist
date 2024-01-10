package com.LucasCagnini13.dto;

import com.LucasCagnini13.Entities.Game;
import com.LucasCagnini13.Projections.GameMinProjection;

public class GameMinDto {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDto() {

	}

	public GameMinDto(Game entity) {

		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public GameMinDto(GameMinProjection entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getGameYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
