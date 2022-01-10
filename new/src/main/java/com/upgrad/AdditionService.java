package com.upgrad;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService{
    public void operate(int x,int y){
        int z=x+y;
        System.out.println("sum ,"+z);
    }
}
