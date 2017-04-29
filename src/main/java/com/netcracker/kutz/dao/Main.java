package com.netcracker.kutz.dao;

import com.netcracker.kutz.dao.dao.CardDAOImpl;
import com.netcracker.kutz.dao.entity.Card;

import java.util.List;

/**
 * Created by Егор on 29.04.17.
 */
public class Main {
    private static CardDAOImpl cardDao;


    public static void main(String[] args) {
        List<Card> list = cardDao.getCards();
    }
}
