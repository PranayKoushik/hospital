package com.alpha.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alpha.hospital.Repository.PatientRepo;
import com.alpha.hospital.entity.Patient;

public class PatientService {
	
	@Autowired
	private PatientRepo pr;

	public void saveStu(Patient p) {
		pr.save(p);
		// TODO Auto-generated method stub
		
	}

}
