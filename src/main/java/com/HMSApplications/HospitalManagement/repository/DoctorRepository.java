package com.HMSApplications.HospitalManagement.repository;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 09-05-2024
 */

import com.HMSApplications.HospitalManagement.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {


    @Autowired
    DoctorRepository doctorRepository = null;

    public default boolean existsByEmail(String email) {
        return doctorRepository.existsByEmail(email);
    }

    public default boolean existsByPhone(String phone) {
        return doctorRepository.existsByPhone(phone);
    }

}
