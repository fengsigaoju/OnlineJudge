package com.lark.sz.dao;

import com.lark.sz.domain.DO.RecordDO;

import java.util.List;

public interface RecordDao {

    /*
    展示所有做题记录
     */
    List<RecordDO> listAllRecords();

    /*
    根据用户id查找该用户做过的题目
     */
    List<RecordDO> queryByUserId(long userId);

    /*
    根据题目id查找某道题被哪些人做过
     */
    List<RecordDO> queryByProblemId(long problemId);

    /*
    根据记录id查找做题记录
     */
    RecordDO queryByRecordId(long recordId);

    /*
    增加记录
     */
    long addRecord(RecordDO recordDO);

    /*
    更新记录信息
     */
    long updateRecord(RecordDO recordDO);

    /*
    更新某条做题记录的判题状态
     */
    long updateStatus(RecordDO recordDO);

    /*
    删除记录
     */
    long deleteRecord(RecordDO recordDO);

}
