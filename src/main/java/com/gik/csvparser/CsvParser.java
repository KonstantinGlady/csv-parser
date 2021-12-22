package com.gik.csvparser;

import com.gik.csvparser.model.ParkingViolations;
import com.gik.csvparser.services.ParkingViolationsService;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@Service
public class CsvParser {

    private ParkingViolationsService service;

    @Autowired
    public CsvParser(ParkingViolationsService service) {
        this.service = service;
    }

    public void run(String[] args) throws IOException {

        String filename = "2017.csv";
        Reader reader = new BufferedReader(new FileReader(filename));

        CsvToBean<ParkingViolations> csvReader = new CsvToBeanBuilder(reader)
                .withSkipLines(1)
                .withType(ParkingViolations.class)
                .withSeparator(',')
                .withIgnoreLeadingWhiteSpace(true)
                .withIgnoreEmptyLine(true)
                .build();

        csvReader.stream()
                .map(x -> {
                    x.setPlateId("****" + x.getPlateId().substring(3));
                    x.setSummonsNumber("**********");
                    return x;
                })
                //.peek(System.out::println)
                //.limit(10)
                .iterator()
                .forEachRemaining(x -> service.save(x));
    }
}
