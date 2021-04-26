package com.southwind.test;

import com.southwind.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        /**
         * 加载 MyBatis 配置文件
         */
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory= sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        String statement = "com.southwind.mapper.AccountMapper.save";

        Account account = new Account(1L, "zhangsan", "123456", 22);

        sqlSession.insert(statement, account);

        sqlSession.commit();
    }
}
