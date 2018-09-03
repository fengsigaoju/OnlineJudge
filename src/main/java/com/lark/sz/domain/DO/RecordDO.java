package com.lark.sz.domain.DO;

import com.lark.sz.domain.BaseObject;

import java.util.Date;

/**
 * @author hui zhang
 * @date 2018-9-3
 */
public class RecordDO extends BaseObject {
    private long userId;

    private long problemId;

    private long recordId;

    private String recordStatus;

    //代码存储路径
    private String routeSuffix;

    private Date gmtCreated;

    private Date gmtModified;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getProblemId() {
        return problemId;
    }

    public void setProblemId(long problemId) {
        this.problemId = problemId;
    }

    public long getRecordId() {
        return recordId;
    }

    public void setRecordId(long recordId) {
        this.recordId = recordId;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getRouteSuffix() {
        return routeSuffix;
    }

    public void setRouteSuffix(String routeSuffix) {
        this.routeSuffix = routeSuffix;
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
