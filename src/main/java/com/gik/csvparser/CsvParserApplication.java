package com.gik.csvparser;

import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CsvParserApplication implements CommandLineRunner {

    // todo 2. Сделай приложение которое будет из большого (10 млн строк) csv файла читать данные,
    //  как-нибудь их обрабатывать (например - анонимизация персональных данных,
    //  замена фамилий на какие-нибудь дефолтные из справочника, номера телефонов и т.п.)
    //  и дальше складывает эти данные в таблицу. Нагенерить csv можно вот тут https://www.kaggle.com/

    @Autowired
    CsvParser csvParser;

    public static void main(String[] args) {
        SpringApplication.run(CsvParserApplication.class, args);
    }

    @Override
    public void run(String... args) throws IOException, CsvException {
            csvParser.run(args);
    }
}
