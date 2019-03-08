package com.jiuxian.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: LIU ZEJUN
 * Date: 2019-03-08 15:40:00
 * Comment:
 */

@Service
public class TestService {

    @Resource
    private DemoService demoService;

    public void message() {
        System.out.println("code:" + demoService.getCode());
        System.out.println("message:" + demoService.getMessage());
    }
}
