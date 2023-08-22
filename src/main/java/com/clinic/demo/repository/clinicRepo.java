package com.clinic.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.demo.entity.clinic;

@Repository
public interface clinicRepo extends JpaRepository<clinic,Integer>{
	//List<clinic> findByClinics(clinic clinicp);
	
}
