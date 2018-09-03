package com.lark.sz.domain.DTO;

import java.util.Date;

/**
 * @author hui zhang
 * @date 2018-9-3
 */
public class problemDTO {
    private long problemId;
    private String problemName;
    //题目描述
    private String description;
    //题目类别
    private String category;
    //输入描述
    private String inputDescription;
    //输入案例
    private String inputCase;
    //输出描述
    private String outputDescription;
    //输出案例
    private String outputCase;

    private Date gmtCreated;

    private Date gmtModified;

    public long getProblemId() {
        return problemId;
    }

    public void setProblemId(long problemId) {
        this.problemId = problemId;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInputDescription() {
        return inputDescription;
    }

    public void setInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
    }

    public String getInputCase() {
        return inputCase;
    }

    public void setInputCase(String inputCase) {
        this.inputCase = inputCase;
    }

    public String getOutputDescription() {
        return outputDescription;
    }

    public void setOutputDescription(String outputDescription) {
        this.outputDescription = outputDescription;
    }

    public String getOutputCase() {
        return outputCase;
    }

    public void setOutputCase(String outputCase) {
        this.outputCase = outputCase;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
