package com.example.demo.service;
import java.util.list;
import com.example.demo.entity.Student;


public interface StudentService{
    Student poststudent(Student st);
    List<Student> getAllStudents();
}