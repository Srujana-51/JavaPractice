package com.springBoot.springBoot.controller;
import com.springBoot.springBoot.entity.Student;
import com.springBoot.springBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/get/{id}")
    public Student findStudent(@PathVariable("id")Integer id){

        return studentService.findStudent(id);
    }
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student s){

        return studentService.saveStudent(s);
    }
    @DeleteMapping("/delete/{i}/name")
    public Student deleteStudent(@PathVariable("i") Integer id){
        return studentService.deleteStudent(id);
    }
    @GetMapping("/findall")
        public List<Student> findAllStudent(){
            return studentService.findAllStudent();
        }

}
