package com.example.smarthome.service;

import smarthome.dto.HeatingSystemDto;
import smarthome.entity.HeatingSystem;

public interface HeatingSystemService {
    HeatingSystemDto getHeatingSystem(Long id);
    HeatingSystemDto updateHeatingSystem(Long id, HeatingSystemDto heatingSystemDto);
    void turnOn(Long id);
    void turnOff(Long id);
    void setTargetTemperature(Long id, double temperature);
    Double getCurrentTemperature(Long id);
}