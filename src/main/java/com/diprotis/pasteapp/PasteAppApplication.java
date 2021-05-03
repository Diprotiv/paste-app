package com.diprotis.pasteapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class PasteAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasteAppApplication.class, args);
    }

}
