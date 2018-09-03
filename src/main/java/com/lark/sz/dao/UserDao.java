package com.lark.sz.dao;
import com.lark.sz.domain.DO.UserDO;

import java.util.List;

public interface UserDao {

    /*
    根据姓名查找用户
     */
    List<UserDO> queryByUserName(String username);

    /*
    根据id查找用户
     */
    UserDO queryByUserId(long userId);

    /*
    展示所有用户
     */
    List<UserDO> listAllUsers();

    /*
    插入用户
     */
    long insertUser(UserDO userDO);

    /*
    更新用户信息
     */
    long updateUser(UserDO userDO);

    /*
    删除用户
     */
    long deleteUser(long userId);


}
