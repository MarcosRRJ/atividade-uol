package br.com.atividade.atividadeuol.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IpVigilanteDTO {

	@JsonProperty(value = "status")
	private String status;

	@JsonProperty(value = "data")
	private Retorno data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Retorno getData() {
		return data;
	}

	public void setData(Retorno data) {
		this.data = data;
	}

	public static class Retorno {

		@JsonProperty(value = "continent_name")
		private String continentName;

		@JsonProperty(value = "country_name")
		private String countryName;

		@JsonProperty(value = "subdivision_1_name")
		private String subdivisionName;

		@JsonProperty(value = "city_name")
		private String cityName;

		@JsonProperty(value = "latitude")
		private String latitude;

		@JsonProperty(value = "longitude")
		private String longitude;

		public String getContinentName() {
			return continentName;
		}

		public void setContinentName(String continentName) {
			this.continentName = continentName;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public String getSubdivisionName() {
			return subdivisionName;
		}

		public void setSubdivisionName(String subdivisionName) {
			this.subdivisionName = subdivisionName;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

	}

}
