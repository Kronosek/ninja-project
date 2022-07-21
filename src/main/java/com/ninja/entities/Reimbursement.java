package com.ninja.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name  = "reimbursement")
public class Reimbursement {
    
    @Id 
    @GeneratedValue
    private int id;
    private String name;
    private int amount;

    public Reimbursement(){}

    public Reimbursement(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Reimbursement(int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Reimbursement [amount=" + amount + ", id=" + id + ", name=" + name + "]";
    }
    
}
