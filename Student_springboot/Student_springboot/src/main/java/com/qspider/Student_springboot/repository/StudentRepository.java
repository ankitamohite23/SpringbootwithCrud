package com.qspider.Student_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qspider.Student_springboot.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
