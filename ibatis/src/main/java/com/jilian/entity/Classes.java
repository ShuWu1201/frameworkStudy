package com.jilian.entity;

import lombok.Data;

import java.util.List;

@Data
public class Classes {
    private long id;
    private String name;
    /**
     * 一个班级对应多个学生
     */
    private List<Student> students;
}
