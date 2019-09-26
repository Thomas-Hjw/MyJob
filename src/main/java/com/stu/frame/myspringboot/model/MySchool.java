package com.stu.frame.myspringboot.model;

public class MySchool {

    private int id;

    private String seq;

    private String score;

    private String name;

    private String level;

    private String remark;

    @Override
    public String toString() {
        return "MySchool{" +
                "id=" + id +
                ", seq='" + seq + '\'' +
                ", score='" + score + '\'' +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
