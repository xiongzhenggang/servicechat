package com.xzg;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 默认启动类
 */
@SpringBootApplication
@MapperScan("com.xzg.mapper")
public class Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}