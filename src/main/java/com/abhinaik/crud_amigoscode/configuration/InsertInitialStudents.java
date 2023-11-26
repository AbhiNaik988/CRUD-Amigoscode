package com.abhinaik.crud_amigoscode.configuration;

import com.abhinaik.crud_amigoscode.models.Student;
import com.abhinaik.crud_amigoscode.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class InsertInitialStudents {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            repository.saveAll(List.of(
                            new Student(1,"abhi",22,"abhinaik988@gmail.com"),
                            new Student(2,"abhay",22,"abhaynaik988@gmail.com"),
                            new Student(3,"dev",21,"devnaik988@gmail.com"))
            );

        };
    }
}
