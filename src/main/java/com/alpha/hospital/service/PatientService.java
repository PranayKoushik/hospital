package com.alpha.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.alpha.hospital.ResponseStructure;
import com.alpha.hospital.Repository.PatientRepo;
import com.alpha.hospital.entity.Patient;
import com.alpha.hospital.exception.PatientNotFoundException;

@Service
public class PatientService {
	@Autowired
	private PatientRepo pr;
	public void savepatient(Patient p) {
		pr.save(p);
	}
	
	public void update(int id ,String newname) {
		Patient p=pr.findById(id).get();
		p.setName(newname);
		pr.save(p);
	}
	public void deletePatient(int id) {
		pr.deleteById(id);
	}
	public ResponseStructure<Patient> findPatient(int id){
		Patient p=pr.findById(id).orElseThrow(() -> new PatientNotFoundException());
	ResponseStructure<Patient> rs =new ResponseStructure<Patient>();
		
			rs.setStatuscode(HttpStatus.FOUND.value());
			rs.setMessage("Patient with id " +id + " FOUND");
			rs.setData(p);

	    return rs;

}


}
//asdfghjkl;lkjhg
