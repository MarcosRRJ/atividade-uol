package br.com.atividade.atividadeuol.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalizacaoDTO {
	
	@JsonProperty(value = "distance")
	private Integer distance;
	
	@JsonProperty(value = "title")
    private String title;
	
	@JsonProperty(value = "woeid")
	private Integer location;

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	} 
	

}
