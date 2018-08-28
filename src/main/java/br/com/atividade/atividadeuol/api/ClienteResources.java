package br.com.atividade.atividadeuol.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.atividade.atividadeuol.dto.ClienteDTO;
import br.com.atividade.atividadeuol.model.Cliente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "test")
public interface ClienteResources {
	
	 @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK", response = String.class),
	            @ApiResponse(code = 400, message = "Bad Request"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Internal Server Error")
	    })
	@ApiOperation(value = "Inicia Serviço para gerar base64 a partir do PDF")
	@PostMapping(value = "/criarCliente", produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity gravaCliente(ClienteDTO cliente);
	 
	 @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK", response = String.class),
	            @ApiResponse(code = 400, message = "Bad Request"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Internal Server Error")
	    })
	@ApiOperation(value = "Inicia Serviço para gerar base64 a partir do PDF")
	@GetMapping(value = "/listarClientes", produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity listaClientes(); 
	 
	 @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK", response = String.class),
	            @ApiResponse(code = 400, message = "Bad Request"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Internal Server Error")
	    })
	@ApiOperation(value = "Inicia Serviço para gerar base64 a partir do PDF")
	@GetMapping(value = "/consultarCliente/{idCliente}", produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity buscaCliente(Integer idCliente); 
	 
	 @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK", response = String.class),
	            @ApiResponse(code = 400, message = "Bad Request"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Internal Server Error")
	    })
	@ApiOperation(value = "Inicia Serviço para gerar base64 a partir do PDF")
	@PostMapping(value = "/alterarCliente/{idCliente}", produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity alteraCliente(Integer idCliente, ClienteDTO clienteDTO);
	 
	 @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK", response = String.class),
	            @ApiResponse(code = 400, message = "Bad Request"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Internal Server Error")
	    })
	@ApiOperation(value = "Inicia Serviço para gerar base64 a partir do PDF")
	@GetMapping(value = "/removerCliente/{idCliente}", produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity deletaCliente(Integer idCliente); 


}
