
package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository ) {
        return args -> {
            Student Sonali = new Student(1L,
                    "Sonali",
                    "sonu@gmail.com",
                    LocalDate.of(1997, APRIL, 24),
                    27
            );
            Student Hari = new Student(
                    "Hari",
                    "hari@gmail.com",
                    LocalDate.of(2000, NOVEMBER, 18),
                    23
            );
            repository.saveAll(
                    List.of(Sonali,Hari)
            );
        };
    }
}
