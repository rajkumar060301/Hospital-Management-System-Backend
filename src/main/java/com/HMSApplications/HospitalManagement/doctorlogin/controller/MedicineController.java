package com.HMSApplications.HospitalManagement.doctorlogin.controller;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 20-Apr-24
 */

import com.HMSApplications.HospitalManagement.doctorlogin.entity.Appointment;
import com.HMSApplications.HospitalManagement.doctorlogin.entity.Medicine;
import com.HMSApplications.HospitalManagement.doctorlogin.repository.MedicinesRepository;
import com.HMSApplications.HospitalManagement.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/v2")
public class MedicineController {

    private MedicinesRepository medicinesRepository;
    public MedicineController(MedicinesRepository medicinesRepository) {
        this.medicinesRepository = medicinesRepository;
    }

    @PostMapping("insert")
    public Medicine createMedicine(@RequestBody Medicine medicine) {
        return medicinesRepository.save(medicine);
    }

    @Autowired
    MedicinesRepository medicinesRepositories;

    @GetMapping("medicines")
    public List<Medicine> getAllMedicines() {
        return medicinesRepositories.findAll();
    }

    @DeleteMapping("medicines/{id}")
    public ResponseEntity<?> deleteMedicine(@PathVariable Long id) {
        Optional<Medicine> appointmentOptional = medicinesRepositories.findById(id);
        if (appointmentOptional.isPresent()) {
            medicinesRepositories.deleteById(id);
            return ResponseEntity.ok().body("{\"message\": \"Appointment deleted successfully\"}"); // Return 200 OK with no body
        } else {
            return ResponseEntity.notFound().build(); // Return 404 Not Found with no body
        }
    }
}
