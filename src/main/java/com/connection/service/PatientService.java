package com.connection.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connection.pojo.Patient;


@Repository
public interface PatientService extends JpaRepository<Patient, Integer> {

}
