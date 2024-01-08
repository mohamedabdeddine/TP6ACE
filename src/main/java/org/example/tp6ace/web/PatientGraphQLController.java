package org.example.tp6ace.web;

import lombok.AllArgsConstructor;
import org.example.tp6ace.dtos.PatientDto;
import org.example.tp6ace.entites.Patient;
import org.example.tp6ace.mapper.PatientMapper;
import org.example.tp6ace.repositories.PatientRepository;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientGraphQLController {
    private PatientRepository patientRepository;
    private PatientMapper patientMAPPER;

    @QueryMapping
    public List<Patient> AllPatients(){return patientRepository.findAll();}

    @QueryMapping
    public Patient getPatientById(@Arguments Long id){
        Patient patient=patientRepository.findById(id).orElse(null);
        if (patient==null) throw new RuntimeException(String.format("hada %s makayench",id));
        return patient;
    }

    @MutationMapping
    public Patient savePatient(@Arguments PatientDto patientDto){
        Patient c=patientMAPPER.fromPatientDtoToPatient(patientDto);
        return patientRepository.save(c);
    }


}
