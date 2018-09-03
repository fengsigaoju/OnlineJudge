package com.lark.sz.domain.DO;

import com.lark.sz.domain.BaseObject;
import org.apache.commons.pool.BaseObjectPool;

import java.util.Date;

/**
 * @author hui zhang
 * @date 2018-9-3
 */
public class UserDO extends BaseObject{
    private String username;
    private long userId;
    private String password;
    private String email;
    private Date gmtCreated;
    private Date gmtModified;
    //用户状态
    private String status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
