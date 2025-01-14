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
public class CartDetail {
    private int cartDetailsID;
    private int cartID;
    private int courseID;
    private BigDecimal price;

    public CartDetail() {
    }

    public CartDetail(int cartDetailsID, int cartID, int courseID, BigDecimal price) {
        this.cartDetailsID = cartDetailsID;
        this.cartID = cartID;
        this.courseID = courseID;
        this.price = price;
    }

    public int getCartDetailsID() {
        return cartDetailsID;
    }

    public void setCartDetailsID(int cartDetailsID) {
        this.cartDetailsID = cartDetailsID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
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
