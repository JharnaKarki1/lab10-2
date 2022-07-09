package edu.miu.cs.cs425.eregistrarwebapi.service;

import edu.miu.cs.cs425.eregistrarwebapi.dto.StudentRequest;
import edu.miu.cs.cs425.eregistrarwebapi.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student registerStudent(StudentRequest studentRequest);
    Student getStudentById(Integer studentId);
    Student updateStudentById(StudentRequest studentRequest, Integer studentId);
    void removeStudentById(Integer studentId);
}
