package com.gik.csvparser.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "Parking_Violations")
public class ParkingViolations {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CsvBindByPosition(position = 0)
    private String summonsNumber;

    @CsvBindByPosition(position = 1)
    private String plateId;

    @CsvBindByPosition(position = 2)
    private String registrationState;

    @CsvBindByPosition(position = 4)
    // TODO: 12/22/2021  @CsvDate("d.mm.yyyy") to Date  // or need converter @CsvCustomBindByName( column = "crawl_timestamp", converter = ZoneDateTimeConverter.class)
    private String issueDate;

    @CsvBindByPosition(position = 5)
    private String violationCode;

    @CsvBindByPosition(position = 6)
    private String vechicleBodyType;

    @CsvBindByPosition(position = 7)
    private String vechicleMake;
}
