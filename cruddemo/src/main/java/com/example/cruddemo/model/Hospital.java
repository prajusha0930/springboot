package com.example.cruddemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/*import jakarta.persistence.Table;*/

@Entity
/*@Table(name="Hospitaldetails")*/
public class Hospital {
@Id
private int id;
private String name;
private int roomno;
private String phno;
private String gname;
private int fees;
private String dname;
private int age;
private int weight;
private int height;
Hospital(){}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoomno() {
	return roomno;
}
public void setRoomno(int roomno) {
	this.roomno = roomno;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public Hospital(int id, String name, int roomno, String phno, String gname, int fees, String dname, int age, int weight,
		int height) {
	super();
	this.id = id;
	this.name = name;
	this.roomno = roomno;
	this.phno = phno;
	this.gname = gname;
	this.fees = fees;
	this.dname = dname;
	this.age = age;
	this.weight = weight;
	this.height = height;
}
}

