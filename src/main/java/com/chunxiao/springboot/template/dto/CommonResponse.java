package com.chunxiao.springboot.template.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class CommonResponse<T> implements Serializable {
    private String message;
    private T data;

    public CommonResponse(String message){
        this(message,null);
    }
    public CommonResponse(T data){
        this("Success",data);
    }
    public CommonResponse(String message, T data) {
        this.message = message;
        this.data = data;
    }
}
