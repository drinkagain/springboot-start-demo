package com.jiuxian;

import com.jiuxian.service.DemoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Author: LIU ZEJUN
 * Date: 2019-03-08 14:55:00
 * Comment:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StartDemoApplicationTests {

    @Resource
    private DemoService demoService;

    @Test
    public void test() {
        String message = demoService.getMessage();
        System.out.println(message);
        Assert.assertEquals("Hello!", message);

        Integer code = demoService.getCode();
        System.out.println(code);
        Assert.assertEquals(123, (int) code);
    }
}
