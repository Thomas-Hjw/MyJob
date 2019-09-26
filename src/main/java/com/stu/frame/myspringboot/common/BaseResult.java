package com.stu.frame.myspringboot.common;

public class BaseResult {
    //回调函数结果集
    private boolean isSuccess;
    //结果编码
    private String resultCode;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "isSuccess=" + isSuccess +
                ", resultCode='" + resultCode + '\'' +
                '}';
    }
}
