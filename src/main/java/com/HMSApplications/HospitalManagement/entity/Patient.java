package com.HMSApplications.HospitalManagement.entity;

import jakarta.persistence.*;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 20-Apr-24
 */
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name="first_name")
    private  String name;

    @Column(name="age")
    private  String age;

    @Column(name="blood_group")
    private  String blood;

    @Column(name="prescription")
    private  String prescription;

    @Column(name="dose")
    private  String dose;

    @Column(name="fees")
    private  String fees;

    @Column(name="urgency")
    private  String urgency;

    public Patient(long id, String name, String age, String blood, String prescription, String dose, String fees, String urgency) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.blood = blood;
        this.prescription = prescription;
        this.dose = dose;
        this.fees = fees;
        this.urgency = urgency;
    }

    public Patient(){
        super();
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
}
