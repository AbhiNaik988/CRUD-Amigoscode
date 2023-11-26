package com.abhinaik.crud_amigoscode.daoimpl;

import com.abhinaik.crud_amigoscode.models.Student;
import com.abhinaik.crud_amigoscode.dao.StudentDao;
import com.abhinaik.crud_amigoscode.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentdaoImpl implements StudentDao {

    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public boolean createStudent(Student student) {
        Student newStudent = this.studentRepository.save(student);
        return newStudent != null ? true : false;
    }

    @Override
    public boolean deleteStudent(Integer studentId) {
        boolean isStudentExists = this.studentRepository.existsById(studentId);
        if(isStudentExists){
            this.studentRepository.deleteById(studentId);
        }
        return isStudentExists;
    }

    @Override
    public Student updateStudent(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return this.studentRepository.findById(studentId).orElseThrow();
    }
}
