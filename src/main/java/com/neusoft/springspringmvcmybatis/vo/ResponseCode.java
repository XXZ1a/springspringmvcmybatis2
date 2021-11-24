package com.neusoft.springspringmvcmybatis.vo;

public enum ResponseCode {
    SUCCESS(2000,"成功",true),
    FAIL(5000,"失败",false),
    ERROR(6000,"未知错误",false),

    FAIL_DATABASE_SELECT(5001,"获取数据失败",false),
    FAIL_DATABASE_UPDATE(5002,"更新数据失败",false),
    FAIL_DATABASE_DELETE(5003,"删除数据失败",false),

    SUCCESS_DATABASE_UPDATE(2001,"更新成功",true),
    SUCCESS_DATABASE_INSERT(2002,"新增成功",true),
    SUCCESS_SERVICE_TRANSFERMONEY(2003,"转账成功",true);

    //响应状态码
    private Integer code;
    //响应信息
    private String msg;
    //响应标志
    private boolean flag;

    private ResponseCode(Integer code,String msg,boolean flag){
        this.code=code;
        this.msg=msg;
        this.flag=flag;
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

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
