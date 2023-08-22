package com.clinic.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clinic_system")

public class clinic {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="clinic_id")
	private int id;
	private String name;
	private String address;
	private String city;
	private String state;
	
	//@OneToOne(mappedBy="clinics",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	private doctor doctor;
	
	/**
	 * @return the doctor
	 */
	
	 // public doctor getDoctor() { return doctor; }
	 
	/**
	 * @param doctor the doctor to set
	 */

	
	  //public void setDoctor(doctor doctor) { this.doctor = doctor; }
	 
	/**
	 * @return the id
	 */
	
	/**
	 * @param id the id to set
	 */
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "clinic [clinicId=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state=" + state
				+ "]";
	}
	
	
}
