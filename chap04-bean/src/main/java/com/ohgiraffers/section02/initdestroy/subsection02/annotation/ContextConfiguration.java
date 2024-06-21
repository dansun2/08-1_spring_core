package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import com.ohgiraffers.common.Berverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
@ComponentScan("com.ohgiraffers.section02.initdestroy.subsection02")
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean
    public Product milk(){
        return new Berverage("딸기우유", 1500, 500);
    }

    @Bean
    public Product water(){
        return new Berverage("지리산 암반수", 3000, 500);
    }

    @Bean
    @Scope("prototype") // bean 인스턴스가 생성되는 생명주기를 관리함
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
}
