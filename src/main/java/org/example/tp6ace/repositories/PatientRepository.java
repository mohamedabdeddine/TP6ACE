package org.example.tp6ace.repositories;

import org.example.tp6ace.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long>{} // Long is the type of the id of the entity Patient

