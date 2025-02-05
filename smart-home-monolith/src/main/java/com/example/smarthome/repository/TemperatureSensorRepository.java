package com.example.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smarthome.entity.TemperatureSensor;

@Repository
public interface TemperatureSensorRepository extends JpaRepository<TemperatureSensor, Long> {
}