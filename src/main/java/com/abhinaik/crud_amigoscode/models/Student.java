package com.abhinaik.crud_amigoscode.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NonNull
    private String name;

    @NonNull
    private Integer age;

    @NonNull
    private String email;

    @Builder
    public Student(String name,Integer age,String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
