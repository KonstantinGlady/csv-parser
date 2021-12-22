package com.gik.csvparser.services;

import com.gik.csvparser.model.ParkingViolations;
import com.gik.csvparser.reposiroties.ParkingViolationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingViolationsService {

private final ParkingViolationsRepository repo;

    @Autowired
    public ParkingViolationsService(ParkingViolationsRepository repo) {
        this.repo = repo;
    }

    public void save(ParkingViolations pv) {
       repo.save(pv);
    }
}
