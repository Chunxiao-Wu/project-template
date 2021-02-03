package com.chunxiao.springboot.template.controller;

import com.chunxiao.springboot.template.annotation.ResponseResult;
import com.chunxiao.springboot.template.service.Greeting;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("Hello world template")
@RestController
public class ProjectTemplateController {

    @Autowired
    private Greeting helloWorldService;

    @ApiOperation("Say Hello")
    @GetMapping("/hello")
    public String greeting() {
        return helloWorldService.greet();
    }

    @ApiOperation("Say Goodbye")
    @GetMapping("/bye")
    @ResponseResult
    public String goodBye() {
        return helloWorldService.greet();
    }


}
