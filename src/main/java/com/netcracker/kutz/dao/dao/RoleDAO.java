package com.netcracker.kutz.dao.dao;

import com.netcracker.kutz.dao.entity.Role;

import java.util.List;

/**
 * Created by Егор on 05.05.17.
 */
public interface RoleDAO {
    List<Role> getAll();
    Role getById(int id);
    void add(Role role);
    void delete(int id);
    void update(Role role);
}
