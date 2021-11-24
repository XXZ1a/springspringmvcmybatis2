package com.neusoft.springspringmvcmybatis.service;


import com.neusoft.springspringmvcmybatis.pojo.User;
import com.neusoft.springspringmvcmybatis.vo.ResponseModel;

import java.util.Map;

public interface UserService {

//    综合案例
    public ResponseModel findUserList() throws Exception;

//    查找用户信息并分页
    public ResponseModel findUserPage(Map<String,Object> map) throws Exception;

//    批量删除
    public ResponseModel deleteUser(Integer[] ids) throws Exception;
}
