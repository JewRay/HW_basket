package com.example.basket.service;

import com.example.basket.component.Basket;

import org.springframework.stereotype.Service;

import java.util.List;



@Service

public class ServiceBasket {

    private final Basket basket;



    public ServiceBasket(Basket basket) {
        this.basket = basket;

    }

    public void add(List<Long> id) {
        basket.add(id);
    }

    public List<Long> get() {
        return basket.get();
    }
}

