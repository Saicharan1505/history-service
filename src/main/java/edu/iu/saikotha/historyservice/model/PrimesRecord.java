package edu.iu.saikotha.historyservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PrimesRecord {

    @Id
    @GeneratedValue
    private int id;

    private String customer;
    private boolean isPrime;

    public int getId(){ return id;}

}
