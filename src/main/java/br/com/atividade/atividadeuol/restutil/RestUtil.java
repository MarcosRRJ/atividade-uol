package br.com.atividade.atividadeuol.restutil;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.atividade.atividadeuol.dto.IpVigilanteDTO;
import br.com.atividade.atividadeuol.dto.LocalizacaoDTO;

public class RestUtil {

	private String urlVigilante;

	private String urlLocalizacao;

	private String urlTemperatura;

	private static Logger logger = Logger.getLogger(RestUtil.class);

	public RestUtil(String urlVigilante, String urlLocalizacao, String urlTemperatura) {
		this.urlVigilante = urlVigilante;
		this.urlLocalizacao = urlLocalizacao;
		this.urlTemperatura = urlTemperatura;
	}

	public RestUtil() {

	}

	public IpVigilanteDTO executar() {

		String ip = null;
		try {
			logger.info("Recuperarando o ip do cliente...");
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			logger.info("Erro ao tentar recuperar o ip do cliente...", e);
		}

		String urlAlvo = urlVigilante + "8.8.8.8";

		ResponseEntity<IpVigilanteDTO> response = getRestUtil().getForEntity(urlAlvo, IpVigilanteDTO.class);

		buscaGeolocalizacao(response.getBody());

		return response.getBody();
	}

	private void buscaGeolocalizacao(IpVigilanteDTO vigilanteDTO) {

		StringBuilder url = new StringBuilder();
		url.append(urlLocalizacao).append(vigilanteDTO.getData().getLatitude())
				.append(",")
				.append(vigilanteDTO.getData().getLongitude());
		
		HttpEntity<String> entity = new HttpEntity<>("");
		ResponseEntity<List<LocalizacaoDTO>> response = getRestUtil().exchange(url.toString(), HttpMethod.GET,entity ,new ParameterizedTypeReference<List<LocalizacaoDTO>>() {});
		
		System.out.println(response.getBody());
		buscaTemperatura(response.getBody()); 
	}

	private void buscaTemperatura(List<LocalizacaoDTO> list) {
		
	}

	protected RestTemplate getRestUtil() {
		return new RestTemplate();
	}
}
