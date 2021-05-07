package com.hogwarts;

import com.hogwarts.repository.HogwartsTestUserMapper;
import com.southwind.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class TestHogwarts {

    public static void main(String[] args) {
        /**
         * 加载 MyBatis 配置文件
         */
        InputStream inputStream = com.southwind.test.Test.class.getClassLoader().getResourceAsStream("hogwartsConfig.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory= sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        HogwartsTestUserMapper hogwartsTestUserMapper = sqlSession.getMapper(HogwartsTestUserMapper.class);

        System.out.println(hogwartsTestUserMapper.selectById(1L));;

        sqlSession.close();
    }

}
