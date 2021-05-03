package com.southwind.test;

import com.jilian.entity.Student;
import com.jilian.repository.ClassesRepository;
import com.jilian.repository.StudentRepository;
import com.jilian2.repository.CustomerRespsitory;
import com.jilian2.repository.GoodsRepository;
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
        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
        System.out.println(studentRepository.findByIdLazy(1L));
        Student student = studentRepository.findByIdLazy(1L);
        System.out.println(student.getClasses());
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findByIdLazy(student.getClasses().getId()));

//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(2L));

//        CustomerRespsitory customerRespsitory = sqlSession.getMapper(CustomerRespsitory.class);
//        System.out.println(customerRespsitory.findById(1L));

//        GoodsRepository goodsRepository = sqlSession.getMapper(GoodsRepository.class);
//        System.out.println(goodsRepository.findById(1L));

        sqlSession.close();
    }
}
