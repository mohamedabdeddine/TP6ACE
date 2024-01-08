package org.example.tp6ace;

import org.example.tp6ace.entites.Patient;
import org.example.tp6ace.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tp6AceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp6AceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(PatientRepository patientRepository) {
		return args -> {
		patientRepository.save(Patient.builder().nom("Amine").email("amine@gmail.com").description("description").build());
		patientRepository.save(Patient.builder().nom("Mohamed").email("mohamed@gmail.com").description("description").build());
		patientRepository.save(Patient.builder().nom("Ali").email("ali@gmail.com").description("description").build());
		};
	}
}
