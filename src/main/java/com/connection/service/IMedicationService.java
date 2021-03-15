package com.connection.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connection.pojo.Medicine;


@Repository
public interface IMedicationService extends JpaRepository<Medicine, Integer>{

}
