package com.clinic.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.demo.entity.prescription;
import com.clinic.demo.repository.prescriptionRepo;

@Service
public class prescriptionService {
    
	@Autowired
	prescriptionRepo prescriptionrepo;
	
public String addPrescription(prescription prescription) {
		
		prescriptionrepo.save(prescription);
		return "success";
	}

	public String deletePrescription(int id) 
	{
		prescriptionrepo.deleteById(id);
		return "success";
	}

	public String updatePrescription(prescription prescription) 
	{
		prescriptionrepo.save(prescription);
		return "success";
	}
}
