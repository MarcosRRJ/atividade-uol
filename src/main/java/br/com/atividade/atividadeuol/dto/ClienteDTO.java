package br.com.atividade.atividadeuol.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ClienteDTO {

	@Valid
	@NotNull(message = "nome: {parametro.obrigatorio}")
	private String nome;

	@Valid
	@NotNull(message = "idade: {parametro.obrigatorio}")
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
