package com.HMSApplications.HospitalManagement;

import com.HMSApplications.HospitalManagement.entity.Doctor;
import com.HMSApplications.HospitalManagement.repository.DoctorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class HospitalManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(HospitalManagementApplication.class, args);
	}

}
