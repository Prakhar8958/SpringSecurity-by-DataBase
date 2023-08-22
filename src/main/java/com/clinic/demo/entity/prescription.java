package com.clinic.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prescription")
public class prescription {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String patient;
	private String doctor;
	@Column(name="created_date_and_time")
	private String createdDateAndTime;
	@Column(name="updated_date_and_time")
	private String updatedDateAndTime;
	private String cause;
	private String notes;
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
	 * @return the patient
	 */
	public String getPatient() {
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(String patient) {
		this.patient = patient;
	}
	/**
	 * @return the doctor
	 */
	public String getDoctor() {
		return doctor;
	}
	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	/**
	 * @return the createdDateAndTime
	 */
	public String getCreatedDateAndTime() {
		return createdDateAndTime;
	}
	/**
	 * @param createdDateAndTime the createdDateAndTime to set
	 */
	public void setCreatedDateAndTime(String createdDateAndTime) {
		this.createdDateAndTime = createdDateAndTime;
	}
	/**
	 * @return the updatedDateAndTime
	 */
	public String getUpdatedDateAndTime() {
		return updatedDateAndTime;
	}
	/**
	 * @param updatedDateAndTime the updatedDateAndTime to set
	 */
	public void setUpdatedDateAndTime(String updatedDateAndTime) {
		this.updatedDateAndTime = updatedDateAndTime;
	}
	/**
	 * @return the cause
	 */
	public String getCause() {
		return cause;
	}
	/**
	 * @param cause the cause to set
	 */
	public void setCause(String cause) {
		this.cause = cause;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "prescription [id=" + id + ", patient=" + patient + ", doctor=" + doctor + ", createdDateAndTime="
				+ createdDateAndTime + ", updatedDateAndTime=" + updatedDateAndTime + ", cause=" + cause + ", notes="
				+ notes + "]";
	}

	
	
}
