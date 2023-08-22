package com.clinic.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.clinic.demo.entity.clinic;
import com.clinic.demo.entity.doctor;
import com.clinic.demo.repository.clinicRepo;
import com.clinic.demo.repository.doctorRepo;

@Service
public class doctorService {
    @Autowired
	doctorRepo doctorrepo;
    
    @Autowired
    clinicRepo clinicrepo;
	public ResponseEntity<String> addDoctors(doctor doctor) {
		int id = doctor.getClinic().getId();
		System.out.println(id);
		Optional<clinic> clinic=clinicrepo.findById(id);
		clinic clinicData=new clinic();
		
		if(!clinic.isPresent()) {
		 clinicData=new clinic();
		clinicData.setId(doctor.getClinic().getId());
		clinicData.setName(doctor.getClinic().getName());
		clinicData.setCity(doctor.getClinic().getCity());
		clinicData.setState(doctor.getClinic().getState());
		clinicrepo.save(clinicData);
		}else {
			clinicData=clinic.get();
		}
		doctor.setClinic(clinicData);
		//int clinicId = doctor.getClinic().getId();
		
		doctorrepo.save(doctor);
		try {
			return new ResponseEntity<>("Success",HttpStatus.CREATED);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Try Again",HttpStatus.BAD_REQUEST);
	
	}


    
    
    
    
    
}
