package com.HMSApplications.HospitalManagement.doctorlogin.repository;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 20-Apr-24
 */

import com.HMSApplications.HospitalManagement.doctorlogin.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinesRepository extends JpaRepository<Medicine, Long> {

}
