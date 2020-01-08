package com.wb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring Boot整合任务：
 *      1.异步任务
 *          在需要异步执行的方法上标记@Async注解
 *          在主配置类上标记@EnableAsync开启异步任务
 *      2.定时任务
 *          在需要定时调度的方法上标记@Scheduled注解，指定cron表达式
 *          在主程序上标记@EnableScheduling开启定时调度
 */
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class SpringbootTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTaskApplication.class, args);
    }

}
