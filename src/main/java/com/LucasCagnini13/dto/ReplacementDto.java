package com.LucasCagnini13.dto;

public class ReplacementDto {

	private int sourceIndex;
	private int destinyIndex;

	public ReplacementDto() {
	}

	public ReplacementDto(int sourceIndex, int destinyIndex) {
		super();
		this.sourceIndex = sourceIndex;
		this.destinyIndex = destinyIndex;
	}

	public int getSourceIndex() {
		return sourceIndex;
	}

	public int getDestinyIndex() {
		return destinyIndex;
	}
}
