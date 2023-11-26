package com.abhinaik.crud_amigoscode.controller;

import com.abhinaik.crud_amigoscode.models.Student;
import com.abhinaik.crud_amigoscode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(this.studentService.getAllStrudents(), HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<Boolean> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(this.studentService.addStudent(student),HttpStatus.CREATED);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> deleteStudent(@RequestParam Integer id){
        return new ResponseEntity<>(this.studentService.deleteStudent(id),HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        return new ResponseEntity<>(this.studentService.updateStudent(student), HttpStatus.OK);
    }

    @GetMapping("id")
    public ResponseEntity<Student> getStudentById(@RequestParam Integer id){
        return new ResponseEntity<>(this.studentService.getStudentbyId(id),HttpStatus.OK);
    }
}
