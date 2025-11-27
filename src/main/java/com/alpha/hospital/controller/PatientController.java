package com.alpha.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.hospital.entity.Patient;
import com.alpha.hospital.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService ps;
	
	@PostMapping("/savePatient")
	public void patientsave(@RequestBody Patient p) {
		ps.savePatient(p);
	}
}
