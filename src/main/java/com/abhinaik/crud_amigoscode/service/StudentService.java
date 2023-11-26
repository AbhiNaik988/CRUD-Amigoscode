package com.abhinaik.crud_amigoscode.service;

import com.abhinaik.crud_amigoscode.models.Student;
import com.abhinaik.crud_amigoscode.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> getAllStrudents(){
        return this.studentDao.getAllStudents();
    }
}
