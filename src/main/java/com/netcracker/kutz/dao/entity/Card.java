package com.netcracker.kutz.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Егор on 29.04.17.
 */
@Entity
@Table(name="card")
public class Card {
    @Id
    @Column(name="card_id")
    private int id;

    @Column(name = "number")
    private int number;

    @Column(name = "valid_thru")
    private String validThru;

    public Card(int id, int number, String validThru) {
        this.id = id;
        this.number = number;
        this.validThru = validThru;
    }

    public Card() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValidThru() {
        return validThru;
    }

    public void setValidThru(String validThru) {
        this.validThru = validThru;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", validThru='").append(validThru).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
