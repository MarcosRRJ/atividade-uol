package br.com.atividade.atividadeuol.convert;

import br.com.atividade.atividadeuol.dto.ClienteDTO;
import br.com.atividade.atividadeuol.model.Cliente;

public final class ConvertCliente {
	
	private ConvertCliente(){}

	public static Cliente converteCliente(ClienteDTO dto) {
		Cliente cliente = new Cliente();
		cliente.setNome(dto.getNome());
		cliente.setIdade(dto.getIdade());

		return cliente;

	}

}
