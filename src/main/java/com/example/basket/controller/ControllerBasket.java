package com.example.basket.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.basket.service.ServiceBasket;


import java.util.List;


@RestController

@RequestMapping("/order")
public class ControllerBasket {
    private final ServiceBasket serviceBasket;

    public ControllerBasket(ServiceBasket serviceBasket) {
        this.serviceBasket = serviceBasket;
    }


    @GetMapping("/add")
    public void add(@RequestParam("id")List<Long> id){
        serviceBasket.add(id);
    }

    @GetMapping ("/get")
    public List<Long> get(){
        return serviceBasket.get();
    }

}
