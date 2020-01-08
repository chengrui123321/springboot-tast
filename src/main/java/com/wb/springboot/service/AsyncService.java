package com.wb.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 服务类
 */
@Service
public class AsyncService {

    @Async
    public void execute() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("execute start ... ");
    }

}
