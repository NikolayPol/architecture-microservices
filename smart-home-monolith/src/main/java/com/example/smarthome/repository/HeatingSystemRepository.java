package com.example.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smarthome.entity.HeatingSystem;

@Repository
public interface HeatingSystemRepository extends JpaRepository<HeatingSystem, Long> {
}
