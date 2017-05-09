package com.netcracker.kutz.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Егор on 05.05.17.
 */
@Entity
@Table(name="account")
public class Account {

    @Id
    @Column(name = "acc_id")
    private int id;

    @Column(name = "card_id")
    private int card_id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "sum")
    private int sum;

    @Column(name = "block_status")
    private int block_status;

    public Account(int id, int card_id, int user_id, int sum, int block_status) {
        this.id = id;
        this.card_id = card_id;
        this.user_id = user_id;
        this.sum = sum;
        this.block_status = block_status;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getBlock_status() {
        return block_status;
    }

    public void setBlock_status(int block_status) {
        this.block_status = block_status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        if (id != account.id) return false;
        if (card_id != account.card_id) return false;
        if (user_id != account.user_id) return false;
        if (sum != account.sum) return false;
        return block_status == account.block_status;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + card_id;
        result = 31 * result + user_id;
        result = 31 * result + sum;
        result = 31 * result + block_status;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", card_id=").append(card_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", sum=").append(sum);
        sb.append(", block_status=").append(block_status);
        sb.append('}');
        return sb.toString();
    }
}
