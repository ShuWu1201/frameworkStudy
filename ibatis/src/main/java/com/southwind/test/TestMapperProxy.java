package com.southwind.test;

import com.southwind.entity.Account;
import com.southwind.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestMapperProxy {
    public static void main(String[] args) {

        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        /**
         * 获取实现接口的代理对象
         */
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);

        /**
         * 增、删、改都需要提交事务，执行完成后需要关闭资源防止资源浪费
         */
//        Account account = new Account(3L, "王武", "678908", 34);
//        accountRepository.save(account);
//        sqlSession.commit();

//        List<Account> list = accountRepository.findAll();
//        for (Account account: list) {
//            System.out.println(account.toString());
//        }
//        sqlSession.close();

        // 通过id查询
//        Account account = accountRepository.findById(2);
//        System.out.println(account.toString());
//        sqlSession.close();

//        Account account = accountRepository.findById(3);
//        account.setUsername("小明");
//        account.setPassword("000");
//        account.setAge(18);
//        int result = accountRepository.update(account);
//        sqlSession.commit();
//        System.out.println(result);
//        sqlSession.close();

//        int result = accountRepository.deleteById(3L);
//        System.out.println(result);
//        sqlSession.commit();
//        sqlSession.close();

        Long id = Long.parseLong("1");
        System.out.println(accountRepository.findNameById(1));
        sqlSession.close();
    }
}
