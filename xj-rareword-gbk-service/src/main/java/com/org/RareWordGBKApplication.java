package com.org;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: xj
 * @version: 2024/7/14
 * @description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.org.mapper")
@Slf4j
public class RareWordGBKApplication {
    public static void main(String[] args) {
        SpringApplication.run(RareWordGBKApplication.class, args);

        log.info("\n"+
                "* * 项目启动成功！！！！！" +"\n"+
                "* * * 小 阿 天 * * * " +"\n"+
                "* * * * 祝 我 * * * " +"\n"+
                "* * * * * 代 码 永 无 bug * * * ");

    }
}