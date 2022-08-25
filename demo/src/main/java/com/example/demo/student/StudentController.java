package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(
                1L,
                "Daniel",
                25,
                LocalDate.of(1997,4,20),
                "danielbrunner@gmx.at"
        ));
        return studentList;
    }
}
