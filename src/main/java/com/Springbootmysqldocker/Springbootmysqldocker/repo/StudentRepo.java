package com.Springbootmysqldocker.Springbootmysqldocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springbootmysqldocker.Springbootmysqldocker.entity.Student;



public interface StudentRepo extends JpaRepository<Student, Integer>{

}
