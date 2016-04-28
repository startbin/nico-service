package com.asknico.demo.core.dao;

import java.util.List;

import com.asknico.demo.model.entities.User;

// 管理用户DAO
public interface UserMapper {

    public List<Object> getUsers();

    // 查询管理用户信息 List<User> list
    public List<Object> getUserList(User user);

    // 查询管理用户信息 总数  count
    public int getUserCount();

    // 单条查询  根据UserID
    public User getUserByID(Integer id);

    // 单条查询  根据UserName
    public User getUserByUserName(String userName);

    //  单条删除管理用户
    public int deleteUserByID(Integer id);

    // 新增管理用户
    public int createUser(User user);

    // 修改管理用户
    public int updateUser(User user);

}
