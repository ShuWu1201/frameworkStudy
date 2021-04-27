package com.jilian.entity;

import lombok.Data;

@Data
public class Student {
    private long id;
    private String name;
    /**
     * 一个学生对应一个班级
     */
    private Classes classes;

}
