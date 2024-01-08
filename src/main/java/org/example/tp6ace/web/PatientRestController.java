package org.example.tp6ace.web;


import lombok.AllArgsConstructor;
import org.example.tp6ace.entites.Patient;
import org.example.tp6ace.repositories.PatientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PatientRestController {
     private PatientRepository patientRepository;

     @GetMapping("/patients")
        public Iterable<Patient> AllPatients(){return patientRepository.findAll();}

     @GetMapping("/patients/{id}")
        public Patient getPatientById(Long id){return patientRepository.findById(id).get();}

    @PostMapping("/patients")
        public Patient savePatient(Patient patient){patientRepository.save(patient);return patient;}
}
