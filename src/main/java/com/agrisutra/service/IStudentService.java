package com.agrisutra.service;

import com.agrisutra.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudents();
    Student getOneStudent(Integer id);
    Integer saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Integer id);
}
