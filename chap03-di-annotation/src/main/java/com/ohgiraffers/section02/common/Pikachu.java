package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Pikachu implements Poketmon{

    @Override
    public void attack() {
        System.out.println("피카츄 전기 충격");
    }
}
