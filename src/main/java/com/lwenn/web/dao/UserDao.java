package com.lwenn.web.dao;

import com.lwenn.web.model.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by lwenn on 15/11/5.
 */
public class UserDao extends SqlMapClientDaoSupport {

    public User addUser(User user) {
        return (User) getSqlMapClientTemplate().insert("addUser", user);
    }

    public int updateUser(User user) {
        return getSqlMapClientTemplate().update("modifyUser", user);
    }

    public int deleteUser(int id) {
        return getSqlMapClientTemplate().delete("deleteUser", id);
    }

    public User getUserById(int id) {
        return (User) getSqlMapClientTemplate().queryForObject("getUserById", id);
    }

    public List<User> getUsersByName(String name) {
        return (List<User>) getSqlMapClientTemplate().queryForList("getUserByName", name);
    }
}
