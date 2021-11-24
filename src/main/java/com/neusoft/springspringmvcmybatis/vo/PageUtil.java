package com.neusoft.springspringmvcmybatis.vo;

import java.util.List;

public class PageUtil<T> {
    private Integer pageNum;    //页码
    private Integer pageSize;   //每页显示条数
    private Integer total;      //总记录数
    private Integer pageCount;  //总页数
    private List<T> list;       //数据(记录)

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount() {
        this.pageCount = this.total%this.pageSize==0?this.total/this.pageSize:this.total%this.pageSize+1;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
