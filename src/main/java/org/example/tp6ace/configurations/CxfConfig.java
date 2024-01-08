package org.example.tp6ace.configurations;

import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.example.tp6ace.web.PatientSoapService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CxfConfig {
       private Bus bus;
       private PatientSoapService patientSoapService;

       @Bean
         public EndpointImpl endpoint(){
                  EndpointImpl endpoint=new EndpointImpl(bus,patientSoapService);
                  endpoint.publish("/patient");
                  return  endpoint;
         }
}
