package com.absattarov.eSchool.controllers;

import com.absattarov.eSchool.Mappers.StudentMapper;
import com.absattarov.eSchool.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class StudentController {
    private final StudentMapper studentMapper;

    @Autowired
    public StudentController(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @GetMapping()
    public ResponseEntity<List<Student>> showStudents(){
        List<Student> students = studentMapper.getAllStudents();
//        if(students.isEmpty()){
//            return new ResponseEntity<>(students, HttpStatus.I_AM_A_TEAPOT);
//        }
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> showStudent(@PathVariable(name = "id") long id){
        Optional<Student> student = studentMapper.getStudent(id);
        if(student.isEmpty()){
            return new ResponseEntity<>(student.get(), HttpStatus.I_AM_A_TEAPOT);
        }
        return new ResponseEntity<>(student.get(), HttpStatus.OK);
    }
    @PostMapping("/{id}/delete")
    public void deleteStudent(@PathVariable(name = "id") long id){
        studentMapper.deleteStudentById(id);
        showStudents();
    }
    @RequestMapping(value = "/add",consumes = "application/json",method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
        //Student student = new Student(firstname,lastname,birthDate);
        studentMapper.save(student);
        showStudents();
    }
}
