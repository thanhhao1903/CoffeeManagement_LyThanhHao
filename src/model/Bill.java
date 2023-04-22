/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Bill implements Serializable{
    private Integer id;
    private String name;
    private Integer price;
    private String orderDate;
    private String size;

    public Bill(Integer id, String name, Integer price, String orderDate, String size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.orderDate = orderDate;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String isSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}
