package br.com.atividade.atividadeuol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.atividade.atividadeuol"})
public class AtividadeUolApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeUolApplication.class, args);
	}
}
