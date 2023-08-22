package com.clinic.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.demo.entity.clinic;
import com.clinic.demo.entity.doctor;
import com.clinic.demo.entity.patient2;
import com.clinic.demo.entity.prescription;
import com.clinic.demo.service.clinicService;
import com.clinic.demo.service.doctorService;
import com.clinic.demo.service.patientService;
import com.clinic.demo.service.prescriptionService;

@RestController
@RequestMapping("clinic")
public class clinicController {

	
	
	@Autowired
	clinicService service;
	
	@Autowired
	patientService service2;
	
	@Autowired
	prescriptionService service3;
	
	@Autowired
	doctorService service4;
	
	@PostMapping("add/clinic")
	public ResponseEntity<String> addClinic(@RequestBody clinic clinic)
	{
		return service.addClinics(clinic);
	}
	
	@GetMapping("allClinics")
	public ResponseEntity<List<clinic>> getAllClinic() 
	{
		return service.getAllClinics();
	}
	
	
	@GetMapping("first_name/{first_name}")
	public ResponseEntity<List<patient2>> getPatientByName(@PathVariable String first_name)
	{
		return service2.getPatientByName(first_name);
	}
	
	@GetMapping("emr_Number/{emrNumber}")
	public ResponseEntity<List<patient2>> getPatientByEmrNumber(@PathVariable String emrNumber)
	{
	return service2.getPatientByEmrNumber(emrNumber);
	}
	
	
	
	@PostMapping("add/patient")
	public ResponseEntity<String> addPatient(@RequestBody patient2 patient)
	{
		return service2.addPatients(patient);
	}
	
	@PostMapping("update/patient")
	public ResponseEntity<String> updatePatient(@RequestBody patient2 patient)
	{
		return service2.updatePatients(patient);
	}
	
	@GetMapping("delete/patient/{id}")
	public ResponseEntity<String> deletePatient(@PathVariable int id) {
		return service2.deletePatient(id);
	}
	
	@PostMapping("add/doctor")
	public ResponseEntity<String> addDoctor(@RequestBody doctor doctor)
	{
		return service4.addDoctors(doctor);
	}
	
	
	@PostMapping("add/prescription")
	public String addPrescription(@RequestBody prescription prescription)
	{
		return service3.addPrescription(prescription);
	}
	
	@PostMapping("update/prescription")
	public String updatePrescription(@RequestBody prescription prescription)
	{
		return service3.updatePrescription(prescription);
	}
	
	@GetMapping("delete/prescription/{id}")
	public String deletePrescription(@PathVariable int id) 
	{
		return service3.deletePrescription(id);
	}
	
	@GetMapping("getDoctorByClinic/{id}")
	public ResponseEntity<List<doctor>> getAllDoctorByClinic(@PathVariable int id)
	{
		return service.getAllDoctorByClinicId(id);
	}
}
