package com.chunxiao.springboot.template.controller;

import com.chunxiao.springboot.template.annotation.ResponseResult;
import com.chunxiao.springboot.template.exception.ApplicationException;
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

    @ApiOperation("unknown issue")
    @GetMapping("/unknownIssue")
    @ResponseResult
    public String unknownIssue() {
        String s = null;
        s.toString();
        return helloWorldService.greet();
    }

    @ApiOperation("known issue")
    @GetMapping("/knownIssue")
    @ResponseResult
    public String knowIssue() {
        System.out.println("know issue");
        try{
            throw new Exception();
        }catch (Exception e){
            throw new ApplicationException("test known issue");
        }
    }


}
