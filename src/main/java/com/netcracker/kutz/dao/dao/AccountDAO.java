package com.netcracker.kutz.dao.dao;

import com.netcracker.kutz.dao.entity.Account;

import java.util.List;

/**
 * Created by Егор on 05.05.17.
 */
public interface AccountDAO {
    List<Account> getAll();
    Account getById(int id);
    void add(Account account);
    void delete(int id);
    void update(Account account);
}
