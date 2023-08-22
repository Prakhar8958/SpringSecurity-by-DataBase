package com.clinic.demo.service;

import java.util.ArrayList;
import java.util.List;
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
public class clinicService {
	
    @Autowired
	clinicRepo clinicrepo;
    @Autowired
    doctorRepo doctorrepo;
	
	public ResponseEntity<List<clinic>> getAllClinics()
	{
		try {
		return new ResponseEntity<>(clinicrepo.findAll(),HttpStatus.OK);
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> addClinics(clinic clinic) {
		clinicrepo.save(clinic);
		try {
			return new ResponseEntity<>("Success",HttpStatus.CREATED);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Try Again",HttpStatus.BAD_REQUEST);
	
	}
	
	

public ResponseEntity<List<doctor>> getAllDoctorByClinicId(int id) {
	Optional<clinic> clinics=clinicrepo.findById(id);
	clinic clinicp=clinics.get();
	try {
		return new ResponseEntity<>(doctorrepo.findByClinic(clinicp),HttpStatus.CREATED);	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);

}


	
}
