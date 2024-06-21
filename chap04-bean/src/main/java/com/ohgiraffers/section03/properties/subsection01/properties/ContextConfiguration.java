package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Berverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.Date;

@Configuration
// resources 하위의 경로로 기술한다.
@PropertySource("section03/properties/subsection01/properties/product-info.properties") // 리소스를 참조하기 때문에 /를 넣어줘야함.
public class ContextConfiguration {

    @Value("${bread.carpbread.name:팥붕어빵}")
    private String carpBreadName;

    @Value("${bread.carpbread.price:0}")
    private int carpBreadPirce;

    @Value("${berverage.milk.name:걍우유}")
    private String milkName;

    @Value("${berverage.milk.price:0}")
    private int milkPirce;

    @Value("${berverage.milk.capacity:0}")
    private int milkCapacity;

    @Bean
    public Product carpBread(){
        return new Bread(carpBreadName, carpBreadPirce, new Date());
    }

    @Bean
    public Product milk(){
        return new Berverage(milkName, milkPirce, milkCapacity);
    }

    @Bean
    public Product water(@Value("${berverage.water.name:걍물}") String waterName,
                         @Value("${berverage.water.price:0}") int waterPrice,
                         @Value("${berverage.water.capacity:0}") int waterCapacity){
        return new Berverage(waterName,waterPrice,waterCapacity);
    }

    @Bean
    @Scope("prototype") // bean 인스턴스가 생성되는 생명주기를 관리함
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
}
