package com.example.demo.cn.cortroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能描述（捕获异常）
 */
@ControllerAdvice
public class AdviceController {
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public  String say(){
        return "亲发生了异常";
    }
}
