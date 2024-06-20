package com.ohgiraffers.section02.annotation.subsection04.resource;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("poketmonServiceResource")
public class PoketmonService {

    /*
    * @Resource 어노테이션은 자바에서 제공하는 기본 어노테이션이다.
    * @Autowired와 같은 스프링 어노테이션과 다르게 name 속성 값으로 의존성 주입을 할 수 있다.
    * */
//    @Resource(name = "charmander")
//    private Poketmon poketmon;
//
//    public void poketmonAttack(){
//        poketmon.attack();
//    }

    @Resource
    private List<Poketmon> poketmons;

    public void poketmonAttack(){
        poketmons.forEach(Poketmon::attack);
    }
}
