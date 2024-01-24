package com.example.basket.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
@SessionScope
public class Basket {

    private final List<Long> id = new ArrayList<>();

    public void add(List<Long> ids){
        this.id.addAll(ids);
    }

    public List<Long> get(){
        return Collections.unmodifiableList(id);
    }
}
