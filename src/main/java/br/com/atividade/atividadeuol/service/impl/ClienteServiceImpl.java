package br.com.atividade.atividadeuol.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.atividade.atividadeuol.model.Cliente;
import br.com.atividade.atividadeuol.repository.ClienteRepository;
import br.com.atividade.atividadeuol.restutil.RestUtil;
import br.com.atividade.atividadeuol.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Value("${vigilante.url}")
	private String urlVigilante;

	@Value("${localizacao.url}")
	private String urlLocalizacao;

	@Value("${temperatura.url}")
	private String urlTemperatura;

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente gravarCliente(Cliente cliente) {
		RestUtil restUtil = getRestUtil();
		restUtil.executar();
		Cliente cli = clienteRepository.save(cliente);
		return cli;
	}

	@Override
	public List<Cliente> listarClientes() {
		List<Cliente> clientes = clienteRepository.findAll();
		return clientes;
	}

	@Override
	public Cliente buscarCliente(Integer idCliente) {
		Cliente cli = clienteRepository.findOne(idCliente);
		return cli;
	}

	@Override
	public Cliente alterarCliente(Cliente obj, Integer idCliente) {
		Cliente cli = clienteRepository.findOne(idCliente);
		cli.setIdade(obj.getIdade());
		cli.setNome(obj.getNome());
		cli = clienteRepository.save(cli);
		return cli;
	}

	@Override
	public Boolean deletarCliente(Integer idCliente) {

		clienteRepository.delete(idCliente);
		return null;
	}

	protected RestUtil getRestUtil() {
		return new RestUtil(urlVigilante, urlLocalizacao, urlTemperatura);
	}

}
