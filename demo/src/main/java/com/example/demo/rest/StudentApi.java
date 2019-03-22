package com.example.demo.rest;

import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentApi {

    @Autowired
    protected StudentService studentService;

  @GetMapping("/getAllStudents")
    private List<Student> getAllStudents(){
    return studentService.getAllStudents();
  }

   @GetMapping("/greeting/{myVariable}")
   private String greeting(@PathVariable String myVariable){
       return "hello " + myVariable;
   }

   @PostMapping("/simplePost/{id}")
   private int postMethod(@RequestBody String s, @PathVariable int id){
       System.out.println(s);
       return id;
   }
   @PostMapping("/insert")
    private void insertStudent(){
      studentService.insertStudent();
   }
}
