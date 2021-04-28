package com.southwind.test;

import com.jilian.repository.ClassesRepository;
import com.jilian.repository.StudentRepository;
import com.jilian2.repository.CustomerRespsitory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class TestJilian {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        /**
         * 获取实现接口的代理对象
         */
//        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
//        System.out.println(studentRepository.findById(1L));

//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(2L));

        CustomerRespsitory customerRespsitory = sqlSession.getMapper(CustomerRespsitory.class);
        System.out.println(customerRespsitory.findById(1L));

        sqlSession.close();
    }
}
