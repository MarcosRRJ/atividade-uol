package br.com.atividade.atividadeuol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "UOL_CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_cliente")
	@SequenceGenerator(sequenceName = "SEQ_cliente", allocationSize = 1, name = "SEQ_cliente")
	private Integer id;
	
	private String nome;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
