package com.patient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.model.Patient;
import com.patient.services.PatientServices;

@RestController
@RequestMapping(value = "clinicalapplication/patientdetails")
public class PatientController {
	@Autowired
	PatientServices patientServices;

	@GetMapping(value="/patients")
	public List<Patient> getPatient() {
		return patientServices.getPatient();
	}	
	@GetMapping(value="/patients/{id}")
	public Patient getPatientbyId( @PathVariable("id") int id) {
		return patientServices.getPatientbyId(id);
	}
	@PostMapping
	public List<Patient> createPatient(@RequestBody Patient pat) {
		return patientServices.createPatient(pat);	
	}
	@PutMapping(value = "/patients/{id}")
	public List<Patient> updatePatient(@RequestBody Patient pat, @PathVariable("id") int id) {
		return patientServices.updatePatient(pat,id);		
	}
}
