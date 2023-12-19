package com.example.msbanque2;

import com.example.msbanque2.entities.Compte;
import com.example.msbanque2.entities.TypeCompte;
import com.example.msbanque2.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Msbanque2Application {

	public static void main(String[] args) {
		SpringApplication.run(Msbanque2Application.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository cr){
		return args -> {
			cr.save(new Compte(1L,100.0,new Date(),TypeCompte.COURANT));
			cr.save(new Compte(2L,150.0,new Date(),TypeCompte.EPARGNE));
			cr.save(new Compte(3L,200.0,new Date(),TypeCompte.EPARGNE));
			cr.findAll().forEach(
					c-> {
						System.out.println(c.toString());
					}
			);
		};
	}
}
