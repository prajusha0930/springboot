package com.example.cruddemo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
       @Id
       private int patid;
       private String address;
       private String city;
       @OneToOne(cascade=CascadeType.ALL)
       @JoinColumn(name="guard_id")
       private Patientdetails pat;
       Address() {}
	public int getPatid() {
		return patid;
	}
	public void setPatid(int patid) {
		this.patid = patid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Patientdetails getPat() {
		return pat;
	}
	public void setPat(Patientdetails pat) {
		this.pat = pat;
	}
	public Address(int patid, String address, String city, Patientdetails pat) {
		super();
		this.patid = patid;
		this.address = address;
		this.city = city;
		this.pat = pat;
	}
	   
	
}

