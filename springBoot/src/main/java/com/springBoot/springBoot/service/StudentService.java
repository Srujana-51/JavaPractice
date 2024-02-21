package com.springBoot.springBoot.service;

import com.springBoot.springBoot.entity.Student;

import java.util.List;

public interface StudentService {
    public Student findStudent(Integer id);
    public Student saveStudent(Student student);
    public Student deleteStudent(Integer id);
    public List<Student> findAllStudent();
}
