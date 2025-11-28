package com.alpha.hospital.DTO;

public class PatientDTO {
private String name;
private int age;
private String Diseases;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDiseases() {
	return Diseases;
}
public void setDiseases(String diseases) {
	Diseases = diseases;
}
public PatientDTO(String name, int age, String diseases) {
	super();
	this.name = name;
	this.age = age;
	Diseases = diseases;
}
public PatientDTO() {
	super();
	// TODO Auto-generated constructor stub
}

}
