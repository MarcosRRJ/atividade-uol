package br.com.atividade.atividadeuol.service;

import java.util.List;

import br.com.atividade.atividadeuol.model.Cliente;

public interface ClienteService {

	Cliente gravarCliente(Cliente cliente);

	List<Cliente> listarClientes();

	Cliente buscarCliente(Integer idCliente);

	Cliente alterarCliente(Cliente cliente, Integer idCliente);

	Boolean deletarCliente(Integer idCliente);

}
