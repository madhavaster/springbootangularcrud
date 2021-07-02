package com.agrisutra.service.impl;

import com.agrisutra.model.Student;
import com.agrisutra.repo.StudentRepository;
import com.agrisutra.service.IStudentService;
import com.agrisutra.util.StudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getOneStudent(Integer id) {
        Optional<Student> byId = repository.findById(id);
        return byId.get();
    }

    @Override
    public Integer saveStudent(Student student) {

        StudentUtil.calculateDtls(student);
        student = repository.save(student);
        return student.getId();
    }

    @Override
    public void updateStudent(Student student) {
        StudentUtil.calculateDtls(student);
        student = repository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        repository.deleteById(id);
    }
}
