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
                            Student.builder().name("Abhi").age(22).email("abhinaik@gmail.com").build(),
                            Student.builder().name("Abhay").age(22).email("abhaynaik@gmail.com").build(),
                            Student.builder().name("Dev").age(21).email("devnaik@gmail.com").build())
            );

        };
    }
}
