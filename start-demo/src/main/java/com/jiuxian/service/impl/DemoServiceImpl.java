package com.jiuxian.service.impl;

import com.jiuxian.service.DemoService;

/**
 * Author: LIU ZEJUN
 * Date: 2019-03-08 10:00:00
 * Comment:
 */

public class DemoServiceImpl implements DemoService {

    @Override
    public String getMessage() {
        return "Hello!";
    }

    @Override
    public Integer getCode() {
        return 123;
    }
}
