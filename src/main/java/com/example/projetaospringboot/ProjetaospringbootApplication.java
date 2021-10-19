package com.example.projetaospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.example.projetaospringboot.model" })
@EnableJpaRepositories(basePackages = "com.example.projetaospringboot.repository") // pacote onde está meu repository
@ComponentScan({"com.example.projetaospringboot"})
public class ProjetaospringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetaospringbootApplication.class, args);
	}

}
