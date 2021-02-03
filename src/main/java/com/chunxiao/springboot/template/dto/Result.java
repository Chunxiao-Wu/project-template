package com.chunxiao.springboot.template.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Result implements Serializable {
    private String message;
    private Object data;

    public static Result success(Object data){
        Result result = new Result();
        result.setMessage("Success");
        return result;
    }


}
