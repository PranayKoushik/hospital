package com.alpha.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.alpha.hospital.Repository.DoctorRepo;
import com.alpha.hospital.Repository.PatientRepo;
import com.alpha.hospital.entity.Patient;
import com.alpha.school.ResponceStructure;
import com.alpha.school.entity.College;
import com.alpha.school.entity.Student;
import com.alpha.school.exception.StudentNotFoundException;

public class PatientService {
	@Autowired
	private DoctorRepo dr;
	
	@Autowired
	private PatientRepo pr;

	public void saveStu(Patient p) {
		
	}

	public ResponceStructure<Patient> findpati(int id) {
		Patient p = pr.findById(id).orElseThrow(() -> new StudentNotFoundException());
		
		ResponceStructure<Patient> rs = new ResponceStructure<Patient>();
		
			rs.setStatuscode(HttpStatus.FOUND.value());
			rs.setMessage("Patient with id " + id+ " found");
			rs.setData(p);
		
		return rs;
		
	}
//
//	public void saveCol(College c) {
//	    cr.save(c);
//		
//	}
//
//	public void deletebyid(int id) {
//		sr.deleteById(id);
//	}
//
//	public void updateById(int id, String name) {
//		Student std = sr.findById(id).get();
//		std.setName(name);
//		sr.save(std);		
//	} 
	
}
