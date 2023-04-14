package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mark = new Student("Mark",
                    LocalDate.of(2000, Month.JANUARY, 5), "Mark@gmail.com");
            Student mike = new Student("mike",
                    LocalDate.of(2000, Month.FEBRUARY, 22), "Mike@gmail.com");
            repository.saveAll(List.of(mark, mike));
        };
    }
}
