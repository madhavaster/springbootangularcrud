package com.agrisutra.rest;

import com.agrisutra.model.Student;
import com.agrisutra.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    @Autowired
    private IStudentService service;

    @PostMapping("/save")
    public ResponseEntity<?> saveStudent(@RequestBody Student student){
        Integer id = service.saveStudent(student);
        String msg = "Student saved with id "+id;
        return ResponseEntity.ok(msg);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> list = service.getAllStudents();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/one/{id}")
    public ResponseEntity<Student> getOneStudent(@PathVariable Integer id){
        Student student = service.getOneStudent(id);
        return ResponseEntity.ok(student);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Integer id){
        service.deleteStudent(id);
        String msg = "Student with id "+id+" deleted!";
        return ResponseEntity.ok(msg);
    }
    @PutMapping("/update")
    public ResponseEntity<?> updateStudent(@RequestBody Student student){
        service.updateStudent(student);
        String msg = "Student with id "+student.getId()+" updated!";
        return ResponseEntity.ok(msg);
    }
}
