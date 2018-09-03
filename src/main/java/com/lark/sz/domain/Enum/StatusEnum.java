package com.lark.sz.domain.Enum;

public enum StatusEnum {
    DELETED("被删除"),

    ADMIN("管理员"),

    READER("普通用户"),

    IS_JUDGING("判题中"),

    PASS("已通过"),

    RUNNING_OUT_TIME("超出时间限制"),

    ERROR("解答错误");

    private String description;

    StatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
