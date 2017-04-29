package com.netcracker.kutz.dao.dao;

import com.netcracker.kutz.dao.entity.Card;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Егор on 29.04.17.
 */
@Repository
public class CardDAOImpl implements CardDao {
    public static void main(String[] args) {
        CardDAOImpl cardDAO = new CardDAOImpl();
        List<Card> cardList = cardDAO.getCards();
    }

    @PersistenceContext(name="dataSource")
    private EntityManager entityManager;

    @Override
    public List<Card> getCards() {
        List<Card> cardList;
        Query query =  entityManager.createQuery("select c from Card c");
        cardList = query.getResultList();
        return cardList;
    }
}
