package de.iav.student.controller;

import de.iav.student.model.Student;
import de.iav.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public void addStudent(@RequestBody Student studentToAdd){
        studentService.addStudent(studentToAdd);
    }
    @GetMapping ("/{id}")
    public Student getStudentById (@PathVariable String id){
        return studentService.getStudentById(id);
    }
}
