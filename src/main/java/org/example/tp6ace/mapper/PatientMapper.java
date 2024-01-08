package org.example.tp6ace.mapper;

import org.example.tp6ace.dtos.PatientDto;
import org.example.tp6ace.entites.Patient;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public Patient fromPatientDtoToPatient(PatientDto patientDto){
        return modelMapper.map(patientDto,Patient.class);
    }
}
