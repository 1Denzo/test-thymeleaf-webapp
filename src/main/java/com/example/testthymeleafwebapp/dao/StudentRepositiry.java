package com.example.testthymeleafwebapp.dao;

import com.example.testthymeleafwebapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositiry extends JpaRepository<Student, Long> {
}
