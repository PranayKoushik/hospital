package com.alpha.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.alpha.hospital.Repository.PatientRepo;
import com.alpha.hospital.entity.Patient;


@Service
public class PatientService {
	
	@Autowired
	private PatientRepo pr;

	public void savePatient(Patient p) {
		pr.save(p);

	}

	public void saveStu(Patient p) {
		
	}

	
	
}
