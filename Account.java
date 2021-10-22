/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgin;

import java.util.Date;

/**
 *
 * @author islam
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account()
    {
     id=0;
     balance=0.0;
     annualInterestRate=0.0;
     dateCreated=new Date();
    }
    public Account(int id,double balance)
    {
        this.id=id;
        this.balance=balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return (annualInterestRate/100)/12;
    }
    public void withdraw(double amount)
    {
        this.balance-=amount;
    }
    public void deposit(double amount)
    {
        this.balance+=amount;
    }
}
