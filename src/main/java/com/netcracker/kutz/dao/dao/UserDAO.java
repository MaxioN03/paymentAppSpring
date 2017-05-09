package com.netcracker.kutz.dao.dao;

import com.netcracker.kutz.dao.entity.User;

import java.util.List;

/**
 * Created by Егор on 05.05.17.
 */
public interface UserDAO {
    List<User> getAll();
    User getById(int id);
    void add(User user);
    void delete(int id);
    void update(User user);
}
