package br.com.alurafood.pagamentosms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PagamentosMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagamentosMsApplication.class, args);
	}

}
