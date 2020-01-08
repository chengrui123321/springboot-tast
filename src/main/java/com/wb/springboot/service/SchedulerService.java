package com.wb.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 定时服务
 */
@Service
public class SchedulerService {

    /**
     * @Scheduled: 标记该方法需要定时调度，调度规则根据设置的cron表达式
     */
    @Scheduled(cron = "* * * * * ?")
    public void execute() {
        System.out.println("scheduler execute " + new Date());
    }

}
