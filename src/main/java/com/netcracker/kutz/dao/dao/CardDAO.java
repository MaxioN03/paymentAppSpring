package com.netcracker.kutz.dao.dao;

import com.netcracker.kutz.dao.entity.Card;

import java.util.List;

/**
 * Created by Егор on 29.04.17.
 */
public interface CardDAO {
    List<Card> getAll();
    Card getById(int id);
    void add(Card card);
    void delete(int id);
    void update(Card card);
}
