package com.clinic.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.clinic.demo.entity.patient2;
import com.clinic.demo.repository.patientRepo;


@Service
public class patientService {

	@Autowired
	patientRepo patientrepo;
	
	
	public ResponseEntity<List<patient2>> getPatientByName(String first_name)
	{
		try {
		return new ResponseEntity<>(patientrepo.findByFirstName(first_name),HttpStatus.OK);
		}
	   catch(Exception e) {
		   e.printStackTrace();
	   }
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}
	
	public ResponseEntity<List<patient2>> getPatientByEmrNumber(String emrNumber) 
	{
		try {
		return new ResponseEntity<>(patientrepo.findByEmrNumber(emrNumber),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
	}

	public ResponseEntity<String> addPatients(patient2 patient) {
		
		patientrepo.save(patient);
		try {
			return new ResponseEntity<>("Success",HttpStatus.CREATED);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Try Again",HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> deletePatient(int id) 
	{
		patientrepo.deleteById(id);
		try {
			return new ResponseEntity<>("success",HttpStatus.OK);		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Try Again",HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> updatePatients(patient2 patient) 
	{
		patientrepo.save(patient);
		try 
		{
			return new ResponseEntity<>("Success",HttpStatus.ACCEPTED);		
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return new ResponseEntity<>("Try Again",HttpStatus.BAD_REQUEST);
	}

	
}
