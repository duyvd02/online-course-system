/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author toila
 */
public class TransactionDetail {
    private int transactionDetailID;
    private int transactionID;
    private int courseID;
    private BigDecimal price;

    public TransactionDetail() {
    }

    public TransactionDetail(int transactionDetailID, int transactionID, int courseID, BigDecimal price) {
        this.transactionDetailID = transactionDetailID;
        this.transactionID = transactionID;
        this.courseID = courseID;
        this.price = price;
    }

    public int getTransactionDetailID() {
        return transactionDetailID;
    }

    public void setTransactionDetailID(int transactionDetailID) {
        this.transactionDetailID = transactionDetailID;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    
}
