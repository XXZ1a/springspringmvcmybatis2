package com.neusoft.springspringmvcmybatis.vo;

public class ResponseModel {
    private Integer code;
    private String msg;
    private boolean flag;
    private Object object;

    //成功并返回查询数据
    public static ResponseModel success(ResponseCode responseCode,Object object){
        ResponseModel model = new ResponseModel();
        model.code=responseCode.getCode();
        model.msg=responseCode.getMsg();
        model.flag=responseCode.getFlag();
        model.object=object;
        return model;
    }

    //成功不返回数据(DML)
    public static ResponseModel success(ResponseCode responseCode){
        ResponseModel model = new ResponseModel();
        model.code=responseCode.getCode();
        model.msg=responseCode.getMsg();
        model.flag=responseCode.getFlag();
        return model;
    }

    //失败不返回数据
    public static ResponseModel fail(ResponseCode responseCode){
        ResponseModel model = new ResponseModel();
        model.code=responseCode.getCode();
        model.msg=responseCode.getMsg();
        model.flag=responseCode.getFlag();
        return model;
    }

    /**
     * 出现异常返回异常信息
     * @param code
     * @param msg
     * @return
     */
    public static ResponseModel error(Integer code,String msg){
        ResponseModel model = new ResponseModel();
        model.code=code;
        model.msg=msg;
        return model;
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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", flag=" + flag +
                ", object=" + object +
                '}';
    }
}
