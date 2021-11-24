package com.neusoft.springspringmvcmybatis.service.impl;

import com.neusoft.springspringmvcmybatis.dao.UserMapper;
import com.neusoft.springspringmvcmybatis.pojo.User;
import com.neusoft.springspringmvcmybatis.service.UserService;
import com.neusoft.springspringmvcmybatis.vo.PageUtil;
import com.neusoft.springspringmvcmybatis.vo.ResponseCode;
import com.neusoft.springspringmvcmybatis.vo.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapeer;

    /**
     * 查询所有用户信息
     * @return
     * @throws Exception
     */
    @Override
    public ResponseModel findUserList() throws Exception {
        return ResponseModel.success(ResponseCode.SUCCESS,userMapeer.queryMsgAll());
    }

    @Override
    public ResponseModel findUserPage(Map<String,Object> map) throws Exception {
        List<User> userList = userMapeer.queryMsgByMap(map);
        PageUtil<User> pageUtil = new PageUtil<>();
        //封装pageUtil
        pageUtil.setPageNum((Integer) map.get("pageNum"));
        pageUtil.setPageSize((Integer)map.get("pageSize"));
        pageUtil.setList(userList);
        //查询总记录数
        pageUtil.setTotal(userMapeer.queryMsgByMapCount(map));
        pageUtil.setPageCount();
        return ResponseModel.success(ResponseCode.SUCCESS,pageUtil);
    }

    @Override
    public ResponseModel deleteUser(Integer[] ids) throws Exception {
        int rows = userMapeer.deleteMsg(ids);
        if(rows==ids.length){
            return ResponseModel.success(ResponseCode.SUCCESS);
        }else {
            throw new Exception("操作失败!");
        }
    }
}
