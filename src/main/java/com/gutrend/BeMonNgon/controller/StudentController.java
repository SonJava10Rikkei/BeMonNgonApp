package com.gutrend.BeMonNgon.controller;

import com.gutrend.BeMonNgon.models.Student;
import com.gutrend.BeMonNgon.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    //    http://localhost:8085/students/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
        return "Hello world! How are you??????";
    }

        //    http://localhost:8085/students/insertStudent
    @RequestMapping(value = "/insertStudent", method = RequestMethod.POST)
    public String insertStudent(@RequestParam String name,
                                @RequestParam Integer birthYear) {
        try {
            Student student = new Student(name, birthYear);
            studentRepository.save(student);
            return "Insert student successfully";
        } catch (Exception e) {
            return "Insert student failed.Error: " + e.toString();
        }
    }
    //    http://localhost:8085/students/showAllStudents
    @RequestMapping(value = "/showAllStudents", method = RequestMethod.GET)
    public Iterable<Student> showAllStudents(){
        return studentRepository.findAll();
    }

}
