package com.southwind.test;

import com.southwind.entity.Account;
import com.southwind.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class TestMybatisCache {
    public static void main(String[] args) {
        InputStream inputStream = TestMybatisCache.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
        Account account = accountRepository.findById(1L);
        System.out.println(account);
        sqlSession.close();

        //如果sqlSession关闭后，需要AccountRepository也需要重新创建才能继续执行，二级缓存也能有作用
        sqlSession = sqlSessionFactory.openSession();
        AccountRepository accountRepository1 = sqlSession.getMapper(AccountRepository.class);
        Account account1 = accountRepository1.findById(1L);
        System.out.println(account1);

    }
}
