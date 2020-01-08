package com.wb.springboot.controller;

import com.wb.springboot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/testAsync")
    public String executeAsync() {
        asyncService.execute();
        return "success";
    }

}
