package com.abhinaik.crud_amigoscode.dao;

import com.abhinaik.crud_amigoscode.models.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();

    public boolean createStudent(Student student);

    public boolean deleteStudent(Integer studentId);

    public Student updateStudent(Student student);

    public Student getStudentById(Integer studentId);
}
