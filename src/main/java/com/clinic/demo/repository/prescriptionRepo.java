package com.clinic.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.demo.entity.prescription;

@Repository
public interface prescriptionRepo extends JpaRepository<prescription,Integer>{

}
