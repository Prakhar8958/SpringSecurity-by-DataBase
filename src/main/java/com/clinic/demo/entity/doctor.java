package com.clinic.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="doctor")

public class doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String speciality;
	//private String clinics;
	
	@ManyToOne
	@JoinColumn(name="clinic_id")
	private clinic clinic;
	
	
	/**
	 * @return the clinics
	 */
	public clinic getClinic() {
		return clinic;
	}
	/**
	 * @param clinics the clinics to set
	 */
	public void setClinic(clinic clinic) {
		this.clinic = clinic;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	/**
	 * @return the clinic
	 */
	/*
	 * public String getClinics() { return clinics; }
	 */
	/**
	 * @param clinic the clinic to set
	 */
	/*
	 * public void setClinic(String clinics) { this.clinics = clinics; }
	 */
	@Override
	public String toString() {
		return "doctor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", speciality=" + speciality
				+ ", clinic=" + clinic + "]";
	}
	


	
	
	
}
