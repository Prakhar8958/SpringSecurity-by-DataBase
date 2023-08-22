package com.clinic.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.demo.entity.patient2;

@Repository
public interface patientRepo extends JpaRepository<patient2,Integer>{

	List<patient2> findByFirstName(String name);
	
	List<patient2> findByEmrNumber(String emrNumber);
}
