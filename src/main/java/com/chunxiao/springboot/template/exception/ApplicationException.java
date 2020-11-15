package com.chunxiao.springboot.template.exception;

public class ApplicationException extends RuntimeException{
    
    public ApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
