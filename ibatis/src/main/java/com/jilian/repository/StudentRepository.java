package com.jilian.repository;

import com.jilian.entity.Student;

public interface StudentRepository {
    public Student findById(long id);
}
