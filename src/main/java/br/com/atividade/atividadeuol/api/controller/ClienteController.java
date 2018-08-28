package br.com.atividade.atividadeuol.api.controller;

import static br.com.atividade.atividadeuol.convert.ConvertCliente.converteCliente;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.atividade.atividadeuol.api.ClienteResources;
import br.com.atividade.atividadeuol.dto.ClienteDTO;
import br.com.atividade.atividadeuol.model.Cliente;
import br.com.atividade.atividadeuol.service.ClienteService;

@RestController
@RequestMapping("test")
public class ClienteController implements ClienteResources {
	
	@Autowired
	private ClienteService clienteService;

	@Override
	public ResponseEntity gravaCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
		Cliente cliente = clienteService.gravarCliente(converteCliente(clienteDTO));
		return ResponseEntity.ok(cliente);
	}

	@Override
	public ResponseEntity listaClientes() {
		List<Cliente> clientes = clienteService.listarClientes();
		return ResponseEntity.ok(clientes);
	}

	@Override
	public ResponseEntity buscaCliente(@PathVariable("idCliente") Integer idCliente) {
		Cliente cliente = clienteService.buscarCliente(idCliente);
		return ResponseEntity.ok(cliente);
	}

	@Override
	public ResponseEntity alteraCliente(@PathVariable("idCliente") Integer idCliente, @Valid @RequestBody ClienteDTO clienteDTO) {
		clienteService.alterarCliente(converteCliente(clienteDTO), idCliente);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@Override
	public ResponseEntity deletaCliente(@PathVariable("idCliente") Integer idCliente) {
		clienteService.deletarCliente(idCliente);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
