package com.chunxiao.springboot.template.interceptor;

import com.chunxiao.springboot.template.dto.CommonResponse;
import com.chunxiao.springboot.template.exception.ApplicationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
@Slf4j
public class ControllerExceptionHandler {
    @ExceptionHandler(ApplicationException.class)
    public CommonResponse<String> handleKnownException(ApplicationException e){
        log.error("Known issue");
        return new CommonResponse<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(),e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @Order
    public CommonResponse<String> handleUnknownException(Exception e){
        log.error("Unknown issue");
        return new CommonResponse<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Unknown error occurs");
    }
}
