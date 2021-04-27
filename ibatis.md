

# MyBatis

ORMapping框架：Object Relationsh Mapping 对象关系映射

对象指向对象

 关系之乡关系型数据库

 Java 到 MySQL 的映射，开发者可以以面向对象的思想来管理数据库；

# 一、MyBatis快速入门

## 如何使用步骤

- 新建 Maven 工程，pom.xml 添加相关依赖

```xml
<dependency>
  <groupId>org.mybatis</groupId>
  <artifactId>mybatis</artifactId>
  <version>3.4.5</version>
</dependency>

<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <version>8.0.11</version>
</dependency>

<dependency>
  <groupId>org.projectlombok</groupId>
  <artifactId>lombok</artifactId>
  <version>1.18.6</version>
  <scope>provided</scope>
</dependency>

<build>
  <resources>
    <resource>
      <directory>src/main/java</directory>
      <includes>
        <include>**/*.xml</include>
      </includes>
    </resource>

    <resource>
      <directory>src/main/resources</directory>
      <includes>
        <include>**/*.xml</include>
      </includes>
    </resource>
  </resources>
</build>
```

- 在数据库中新建一张表

```mysql
use mybatis;
create table t_account(
	id int primary key auto_increment,
    username varchar(11),
    password varchar(11),
    age int
);
```

- 新建数据表对应的实体类 Account

```java
package com.southwind.entity;

import lombok.Data;

@Data
public class Account {
    private long id;
    private String username;
    private String passward;
    private int age;
}
```

- 创建 MyBatis 的配置文件 config.xml，文件名可自定义

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

    <!-- 配置 MyBatis 运行环境，可配置多个环境，default默认指定一个即可 -->
    <environments default="development">
        <environment id="development">
            <!-- 配置 JDBC 的事务管理 -->
            <transactionManager type="JDBC"></transactionManager>
            <!-- 使用 POOLED 配置 JDBC 数据源连接池 -->
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.cj.jdbc.Driver"></property>
                <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useUnicode=true&amp;characterEncoding=UTF-8"></property>
                <property name="username" value="root"></property>
                <property name="password" value="xxxxxx"/>
            </dataSource>
        </environment>

        <environment id="">
            <transactionManager type=""></transactionManager>
            <dataSource type=""></dataSource>
        </environment>
    </environments>
</configuration>
```

>使用原生接口的方式

1、MyBatis 框架需要开发者自定义 SQL 语句，写在 Mapper.xml 文件中，实际开发中会为每一个实体类创建对应的 Mapper.xml，定义管理该对象数据的 SQL。

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.southwind.mapper.AccountMapper">

    <!-- id是后面调用SQL语句时要使用的名字，parameterType定义的save方法中传的参数-->
    <insert id="save" parameterType="com.southwind.entity.Account">
        insert into t_account(username,password,age) values (#{username},#{password},#{age})
    </insert>

<!--    <update id=""></update>-->
<!--    <delete id=""></delete>-->
<!--    <select id=""></select>-->

</mapper>
```

- namespace：通常设置为文件所在的包+文件名的形式。
- insert 标签表示执行添加操作。其他标签类似。
- id 实际调用 MyBatis 方法时需要用到的参数。
- parameterType 是调用对应方法时参数的数据类型。

2、在全局配置文件 config.xml 中注册 AccountMapper.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

    <!-- 配置 MyBatis 运行环境，可配置多个环境，default默认指定一个即可 -->
    <environments default="development">
        <environment id="development">
            <!-- 配置 JDBC 的事务管理 -->
            <transactionManager type="JDBC"></transactionManager>
            <!-- 使用 POOLED 配置 JDBC 数据源连接池 -->
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.cj.jdbc.Driver"></property>
                <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useUnicode=true&amp;characterEncoding=UTF-8"></property>
                <property name="username" value="root"></property>
                <property name="password" value="xxxxxx"/>
            </dataSource>
        </environment>

        <environment id="">
            <transactionManager type=""></transactionManager>
            <dataSource type=""></dataSource>
        </environment>
    </environments>

    <!-- 注册 AccountMapper.xml -->
    <mappers>
        <mapper resource="com/southwind/mapper/AccountMapper.xml"></mapper>
    </mappers>
</configuration>
```

3、调用 MyBatis 的原生接口来执行添加操作。

```java
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

        Account account = new Account(1L, "张三", "123456", 22);

        sqlSession.insert(statement, account);
        
        sqlSession.commit();
    }
}

```

## 问题&解决

1、汉字字段无法插入，报错信息为： Incorrect string value: '\xE5\xBC\xA0\xE4\xB8\x89' for column 'name' at row 1。

原因：数据库编码、排序类型不是utf-8的，所以创建的表的排序规则自然也不是utf-8类型的。在mysql中新建数据库，如果只写数据库名，没有设置字符集和排序规则，默认字符集为latin1 ，排序规则为latin1_swedish_ci 

解决：把数据库的字符集设为utf-8,把排序规则设置为utf8_general_ci，同时把表的排序规则也设置为utf8_general_ci，但是仍然不可以用，有博主说是mysql默认的配置文件是/etc/my.cnf或者/etc/mysql/my.cnf ，但是没找到这个文件，我的解决办法就是把表删了重新创建的，然后就可以了。

总结：只要数据库存储中文数据，创建数据库的时候千万别忘了设置字符集为utf-8。

2、Mapper.xml文件放在src/main/java目录下时找不到Mapper.xml文件

原因：IDEA 只能读取resources目录下的资源文件，但是比如mybatis的映射配置文件mapper.xml放在特定的包里面，与dao层，service层等层次为同一个层级时IDEA无法读取，如果放在resource文件夹下又不方便分层。

解决：1、将所有资源文件放在resources文件夹下，即讲mapper.xml文件放在resources文件夹下，但是不便于分层

2、如果该项目是maven项目，在配置maven的pom文件里，找到<build>节点，添加下列代码：表示可以读取src/main/java目录下的.xml文件

```xml
<build>  
    <resources>  
        <resource>  
            <directory>src/main/java</directory>  
            <includes>  
                <include>**/*.xml</include>  
            </includes>  
        </resource>  
    </resources>  
</build>  
```

其他解决方案：https://www.cnblogs.com/jpfss/p/8301503.html



> 通过 MyBatis Mapper 代理实现自定义接口

- 自定义接口，定义相关业务方法。
- 编写与方法相对应的 Mapper.xml。

1、自定义接口

````java
package com.southwind.repository;

import com.southwind.entity.Account;
import java.util.List;

public interface AccountRepository {

    public int save(Account account);
    public int update(Account account);
    public int deleteById(long id);
    public List<Account> findAll();
    public Account findById(long id);

}

````

2、创建接口对应的 Mapper.xml，定义接口方法对应的 SQL 语句。

statement 标签可根据 SQL 执行的业务来选择 insert、delete、update、select。

MyBatis 框架会根据规则自动创建接口实现类的代理对象。

规则：

- Mapper.xml 中 namespace 为接口的全类名。 
- Mapper.xml 中 statement 的 id 为接口中对应的方法名。
- Mapper.xml 中 statement 的 parameterType 和接口中对应方法的参数类型一致。
- Mapper.xml 中 statement 的 resultType 和接口中对应方法的返回值类型一致。

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.southwind.repository.AccountRepository">
    <insert id="save" parameterType="com.southwind.entity.Account">
        insert into t_account(username,password,age) values (#{username},#{password},#{age})
    </insert>

    <update id="update" parameterType="com.southwind.entity.Account">
        update t_account set username = #{username},password = #{password},age = #{age} where id = #{id}
    </update>

    <!-- parameterType 写基本数据类型 long 或者包装类型 java.lang.Long 均可-->
    <delete id="deleteById" parameterType="java.lang.Long">
        delete from t_account where id = #{id}
    </delete>

    <!-- resultType 不要去写返回的类型 List，要写泛型里面的类型 -->
    <select id="findAll" resultType="com.southwind.entity.Account">
        select * from t_account
    </select>

    <select id="findById" parameterType="long" resultType="com.southwind.entity.Account">
        select * from t_account where id = #{id}
    </select>
</mapper>
```

3、在 config.xml 中注册 AccountRepository.xml。

```xml
<!-- 注册 AccountMapper.xml -->
<mappers>
  <mapper resource="com/southwind/mapper/AccountMapper.xml"></mapper>
  <mapper resource="com/southwind/repository/AccountRepository.xml"></mapper>
</mappers>
```

4、调用接口的代理对象完成相关的业务。

```java
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

        int result = accountRepository.deleteById(3L);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();
    }
}

```

## 问题&解决

1、增、删、改操作没有提交事务，数据库不会更新。



## Mapper.xml

- Statement 标签：select、update、delete、insert 分别对应查询、更新、删除、插入

- parameterType：参数数据类型

  1、基本数据类型，通过id查询Account：public int deleteById(long id);

  ```xml
  <select id="findById" parameterType="long" resultType="com.southwind.entity.Account">
  	select * from t_account where id = #{id}
  </select> 
  ```

  2、String 类型，通过 name 来查询 Account：public Account findByName(String name);

  ```xml
  <select id="findByName" parameterType="java.lang.String" resultType="com.southwind.entity.Account">
    select * from t_account where username = #{username}
  </select>
  ```

  3、包装类，通过id查询Account，和基本数据类型一样：public Account findById2(Long id);

  包装类和基本数据类型有一个区别：基本数据类型不能时null值，但是包装类可以用null

  ```xml
  <select id="findById2" parameterType="java.lang.Long" resultType="com.southwind.entity.Account">
  		select * from t_account where id = #{id}
  </select>
  ```

  4、多个参数，通过 name 和 age 查询 Account：public Account findByNameAndAge(String name, int age);

  通过 param1、param2 进行赋值，下标从 1 开始(或者：username = #{arg0} and #{arg1}，下标从0开始)。具体参数和版本也有关系，低版本使用0、1即可：#{0} and #{1}。

  ```xml
  <select id="findByNameAndAge" resultType="com.southwind.entity.Account">
  	select * from t_account where username = #{param1} and #{param2}
  </select>
  
  或者
  
  <select id="findByNameAndAge" resultType="com.southwind.entity.Account">
    select * from t_account where username = #{arg0} and #{arg1}
  </select>
  ```

  5、java bean 作为参数：public int update(Account account);

  ```xml
  <update id="update" parameterType="com.southwind.entity.Account">
  	update t_account set username = #{username},password = #{password},age = #{age} where id = #{id}
  </update>
  ```

- resultType：结果类型

  1、基本数据类型，统计 Account 总数：public int count();

  ```xml
  <select id="count" resultType="int">
  	select count(id) from t_account
  </select>
  ```

  2、包装类，统计 Account 总数：public Integer count2();

  ```xml
  <select id="count2" resultType="java.lang.Integer">
  	select count(id) from t_account
  </select>
  ```

  3、String 类型：通过 id 查询 Account 的 name：public String findNameById(long id);

  ```xml
  <select id="findNameById" parameterType="long" resultType="java.lang.String">
  	select username from t_account where id = #{id}
  </select>
  ```

  4、java bean 类型：public Account findById(long id);

  ```xml
  <select id="findById" parameterType="long" resultType="com.southwind.entity.Account">
  	select * from t_account where id = #{id}
  </select>
  ```

## 及联查询

- 一对多

```mysql
UPDATE `mybatis`.`student` SET `cid`='2' WHERE `id`='1';
INSERT INTO `mybatis`.`student` (`id`, `name`, `cid`) VALUES ('2', '李四', '2');
INSERT INTO `mybatis`.`student` (`id`, `name`, `cid`) VALUES ('3', '王五', '2');
```

