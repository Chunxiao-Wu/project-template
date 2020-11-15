package com.chunxiao.springboot.template.service.imp;

import com.chunxiao.springboot.template.constant.Greetings;
import com.chunxiao.springboot.template.service.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloWorld implements Greeting {
    @Override
    public String greet() {
        log.info("In Hello world service");
        return Greetings.HELLO_WORLD;
    }
}
