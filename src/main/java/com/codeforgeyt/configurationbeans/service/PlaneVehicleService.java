package com.codeforgeyt.configurationbeans.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaneVehicleService implements VehicleService{

    private Logger log = LoggerFactory.getLogger(PlaneVehicleService.class);

    @Override
    public void startEngine() {
        log.info("Starting plane engine...");
    }

    @Override
    public void move() {
        log.info("Flying away...");
    }

    @Override
    public void stopEngine() {
        log.info("Landing and turning off plane engine...");
    }
}
