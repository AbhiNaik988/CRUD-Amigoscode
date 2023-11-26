package com.abhinaik.crud_amigoscode.repository;

import com.abhinaik.crud_amigoscode.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
