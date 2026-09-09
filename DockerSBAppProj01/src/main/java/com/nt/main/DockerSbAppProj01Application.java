package com.nt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerSbAppProj01Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerSbAppProj01Application.class, args);
		System.out.println("Welcome Docker Spring Boot App");
	}

}
