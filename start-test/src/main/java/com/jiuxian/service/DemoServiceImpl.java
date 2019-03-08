package com.jiuxian.service;

import org.springframework.stereotype.Service;

/**
 * Author: LIU ZEJUN
 * Date: 2019-03-08 15:48:00
 * Comment:
 */


//@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getMessage() {
        return "World";
    }

    @Override
    public Integer getCode() {
        return 456;
    }
}
