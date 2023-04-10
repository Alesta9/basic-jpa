package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean // runs when application starts
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student ugur = new Student("ugur",
                    "dogan",
                    "uur.dogan@hotmail.com",
                     21);
            studentRepository.save(ugur);

        };
    }

}
