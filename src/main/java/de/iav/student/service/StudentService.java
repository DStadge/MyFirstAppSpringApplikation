package de.iav.student.service;

import de.iav.student.model.Student;
import de.iav.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public Student getStudentById(String id) {
        return studentRepository.getStudentById(id);
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }


}
