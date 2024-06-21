package com.ohgiraffers.section01.scope.subsection01.singleton;

import com.ohgiraffers.common.Berverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean: beanNames) {
            System.out.println("BeanName : " + bean);
        }

        //붕어빵, 딸기우유, 지리산 암반수 등의 빈 객체를 반환한다.
        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Berverage.class);
        Product water = context.getBean("water", Berverage.class);

        ShoppingCart cart1 = (ShoppingCart) context.getBean("cart");
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("cart1에 담긴 내용 : " + cart1.getItems());
    }
}
