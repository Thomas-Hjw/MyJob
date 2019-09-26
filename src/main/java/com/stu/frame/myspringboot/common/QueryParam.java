package com.stu.frame.myspringboot.common;

import java.util.Map;

public class QueryParam {
    private int limit;
    private int offset;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "limit=" + limit +
                ", offset=" + offset +
                '}';
    }

//    //每页显示数量
//    private int pageSize;
//    //当前页码
//    private int pageNumber;
//    //排序字段
//    private String sortName;
//    //排序顺序
//    private String sortOrder;
//
//    private Map<String, Object> search;
//
//    public int getPageSize() {
//        return pageSize;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public int getPageNumber() {
//        return pageNumber;
//    }
//
//    public void setPageNumber(int pageNumber) {
//        this.pageNumber = pageNumber;
//    }
//
//    public String getSortName() {
//        return sortName;
//    }
//
//    public void setSortName(String sortName) {
//        this.sortName = sortName;
//    }
//
//    public String getSortOrder() {
//        return sortOrder;
//    }
//
//    public void setSortOrder(String sortOrder) {
//        this.sortOrder = sortOrder;
//    }
//
////    public Map<String, Object> getSearch() {
////        return search;
////    }
////
////    public void setSearch(Map<String, Object> search) {
////        this.search = search;
////    }
//
//    @Override
//    public String toString() {
//        return "QueryParam{" +
//                "pageSize=" + pageSize +
//                ", pageNumber=" + pageNumber +
//                '}';
//    }
}
