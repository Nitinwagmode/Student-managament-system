package com.example.sms1.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.sms1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}