package com.example.cruddemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patientdetails {
       @Id
       private int patid;
       private String diseasename;
       private String medicinename;
       Patientdetails() {}
       public int getPatid() {
		return patid;
	}
	public void setPatid(int patid) {
		this.patid = patid;
	}
	public String getDiseasename() {
		return diseasename;
	}
	public void setDiseasename(String diseasename) {
		this.diseasename = diseasename;
	}
	public String getMedicinename() {
		return medicinename;
	}
	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}
	public Patientdetails(int patid, String diseasename, String medicinename) {
		super();
		this.patid = patid;
		this.diseasename = diseasename;
		this.medicinename = medicinename;
	}
	
       
	
}
