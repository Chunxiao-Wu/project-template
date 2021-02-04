package com.chunxiao.springboot.template.dto;

import com.sun.net.httpserver.Authenticator;
import lombok.Data;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
@ToString
public class CommonResponse<T> implements Serializable {
    private int returnCode;
    private String message;
    private T data;

    public CommonResponse(int returnCode,String message){
        this(returnCode,message,null);
    }
    public CommonResponse(T data){
        this(HttpStatus.OK.value(), "OK",data);
    }
    public CommonResponse(int returnCode,String message, T data) {
        this.returnCode = returnCode;
        this.message = message;
        this.data = data;
    }
}
