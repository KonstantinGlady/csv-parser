package com.gik.csvparser.reposiroties;

import com.gik.csvparser.model.ParkingViolations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingViolationsRepository extends JpaRepository<ParkingViolations, Long> {
}
