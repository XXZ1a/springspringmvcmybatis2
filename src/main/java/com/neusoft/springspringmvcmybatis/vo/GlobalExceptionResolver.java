package com.neusoft.springspringmvcmybatis.vo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

//@ControllerAdvice + @ExceptionHandler 进行全局的 Controller 层异常处理。
@ControllerAdvice
@ResponseBody
public class GlobalExceptionResolver {

    @ExceptionHandler(Exception.class)//只要出现Exception异常,就会执行对应的异常处理器方法
    public ResponseModel handleException(Exception e){
        return ResponseModel.error(600,e.getMessage());
    }

    @ExceptionHandler(CustomException.class)//只要出现CustomException异常,就会执行对应的异常处理器方法
    public ResponseModel handleCustomException(CustomException e){
        return ResponseModel.error(e.getCode(),e.getMsg());
    }
}
