package com.chunxiao.springboot.template.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE,METHOD})
@Documented
public @interface ResponseResult {
}
