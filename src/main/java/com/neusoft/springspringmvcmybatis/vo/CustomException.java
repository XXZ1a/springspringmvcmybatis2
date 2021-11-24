package com.neusoft.springspringmvcmybatis.vo;

public class CustomException extends Exception{

    private Integer code;
    private String msg;

    public CustomException(Integer code, String msg) {
        super("msg");
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
