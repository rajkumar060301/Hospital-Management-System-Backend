package com.HMSApplications.HospitalManagement.controller;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 20-Apr-24
 */

import com.HMSApplications.HospitalManagement.doctorlogin.entity.Medicine;
import com.HMSApplications.HospitalManagement.entity.Patient;
import com.HMSApplications.HospitalManagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1")
public class PatientController {

    private PatientRepository PatientRepository;

    public PatientController(PatientRepository PatientRepository) {
        this.PatientRepository = PatientRepository;
    }
    @PostMapping("/insert")
    public Patient createPatient(@RequestBody Patient patient) {
        return PatientRepository.save(patient);

    }

    @Autowired
    PatientRepository patientRepository;
    @GetMapping("patients")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    @DeleteMapping("patients/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable Long id) {
        Optional<Patient> appointmentOptional = patientRepository.findById(id);
        if (appointmentOptional.isPresent()) {
            patientRepository.deleteById(id);
            return ResponseEntity.ok().body("{\"message\": \"Appointment deleted successfully\"}"); // Return 200 OK with no body
        } else {
            return ResponseEntity.notFound().build(); // Return 404 Not Found with no body
        }
    }

}
