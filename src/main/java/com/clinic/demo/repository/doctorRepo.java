package com.clinic.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.demo.entity.clinic;
import com.clinic.demo.entity.doctor;

@Repository
public interface doctorRepo extends JpaRepository<doctor,Integer>{
	public List<doctor> findByClinic(clinic clinic);
	
}
