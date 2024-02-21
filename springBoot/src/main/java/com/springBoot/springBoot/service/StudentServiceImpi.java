package com.springBoot.springBoot.service;

import com.springBoot.springBoot.entity.Student;
import com.springBoot.springBoot.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service 
public class StudentServiceImpi implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student findStudent(Integer id) {
        Optional<Student> st=studentRepo.findById(id);
        if(st.isPresent()){
            return st.get();
        }
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        Student st=studentRepo.save(student);
        return st;
    }

    @Override
    public Student deleteStudent(Integer id) {
        Optional<Student> st=studentRepo.findById(id);
        if(st.isPresent()){
            studentRepo.deleteById(id);
            return st.get();
        }
        return null;
    }

    @Override
    public List<Student> findAllStudent() {
        List<Student> students=studentRepo.findAll();
        return students;
    }
}
