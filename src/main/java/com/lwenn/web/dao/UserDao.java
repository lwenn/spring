package com.lwenn.web.dao;

import com.lwenn.web.model.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by lwenn on 15/11/5.
 */
public class UserDao extends SqlMapClientDaoSupport {

    // 这个函数返回的是Insert之后这条记录的主键，并不是插入的对象本身。
    public Long addUser(User user) {
        return (Long) getSqlMapClientTemplate().insert("User.addUser", user);
    }

    public int updateUser(User user) {
        return getSqlMapClientTemplate().update("User.modifyUser", user);
    }

    public int deleteUser(Long id) {
        return getSqlMapClientTemplate().delete("User.deleteUser", id);
    }

    public User getUserById(Long id) {
        return (User) getSqlMapClientTemplate().queryForObject("User.getUserById", id);
    }

    public List<User> getUsersByName(String name) {
        return (List<User>) getSqlMapClientTemplate().queryForList("User.getUserByName", name);
    }
}
