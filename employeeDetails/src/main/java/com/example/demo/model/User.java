package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/*Name: 
DOB:
Father/Husband Name:
Department:
Role:
Gender:
Marital Status:
permanent Address:
Current Located Address:
Contact Number:*/

@Entity 
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  
  private String name;
  private String dob;

  private String guardianName;
  
  private String department;
  
  private String role;
  
  private String gender;
  
  private String maritalStatus;
  
  private String permanentAddress;
  
  private String currentLocatedAddress;
  
  private String contactNumber;

public String getContactNumber() {
	return contactNumber;
}

public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public String getCurrentLocatedAddress() {
	return currentLocatedAddress;
}

public void setCurrentLocatedAddress(String currentLocatedAddress) {
	this.currentLocatedAddress = currentLocatedAddress;
}

public String getPermanentAddress() {
	return permanentAddress;
}

public void setPermanentAddress(String permanentAddress) {
	this.permanentAddress = permanentAddress;
}

public String getMaritalStatus() {
	return maritalStatus;
}

public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getGuardianName() {
	return guardianName;
}

public void setGuardianName(String guardianName) {
	this.guardianName = guardianName;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
  
  
  


}