package com.javanauta.aprendendospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AprendendoSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AprendendoSpringApplication.class, args);

		Usuario joao = new Usuario("João","joaodasilva@hotmail.com","senha123");

		System.out.println(joao.getNome());
		joao.setNome("João da Silva");
		System.out.println(joao.getNome());


	}

}
