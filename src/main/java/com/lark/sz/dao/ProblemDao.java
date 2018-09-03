package com.lark.sz.dao;

import com.lark.sz.domain.DO.ProblemDO;

import java.util.List;

public interface ProblemDao {
    /*
    展示所有题目
     */
    List<ProblemDO> listAllProblems();

    /*
    根据题目名查找题目
     */
    List<ProblemDO> queryProblemByName(String problemName);

    /*
    根据题号查找题目
     */
    ProblemDO queryProblemById(long problemId);

    /*
    插入题目
     */
    long insertProblem(ProblemDO problemDO);

    /*
    更新题目
     */
    long updateProblem(ProblemDO problemDO);

    /*
    删除题目
     */
    long deleteProblem(long problemId);

}
