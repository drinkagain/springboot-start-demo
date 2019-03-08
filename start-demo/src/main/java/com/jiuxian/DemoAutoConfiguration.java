package com.jiuxian;

import com.jiuxian.service.DemoService;
import com.jiuxian.service.impl.DemoServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: LIU ZEJUN
 * Date: 2019-03-08 10:02:00
 * Comment:
 */

@Configuration
public class DemoAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(DemoService.class)
    public DemoService demoService() {
        return new DemoServiceImpl();
    }
}
