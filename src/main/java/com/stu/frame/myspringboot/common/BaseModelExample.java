package com.stu.frame.myspringboot.common;

/**
 * 扩展MyBatis自动生成的Example，添加分页功能
 */
public class BaseModelExample {
    //开始记录索引
    protected int rowIndex;
    //每页显示的数量
    protected int pageSize;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
