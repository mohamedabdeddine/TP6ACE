package org.example.tp6ace.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.example.tp6ace.dtos.PatientDto;
import org.example.tp6ace.entites.Patient;
import org.example.tp6ace.mapper.PatientMapper;
import org.example.tp6ace.repositories.PatientRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@WebService
public class PatientSoapService {
    private PatientMapper patientMapper;
    private PatientRepository patientRepository;

    public List<Patient> AllPatients(){return patientRepository.findAll();}
    @WebMethod
    public Patient getPatientById(@WebParam(name="id") Long id){return patientRepository.findById(id).get();}
    @WebMethod
    public Patient savePatient(@WebParam(name="patient") PatientDto patientDto){
        Patient patient=patientMapper.fromPatientDtoToPatient(patientDto);
        return patientRepository.save(patient);
    }


}


