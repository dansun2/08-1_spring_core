package com.ohgiraffers.section02.annotation.subsection05.inject;


import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

@Service("poketmonServiceInject")
public class PoketmonService {

    //1. 필드 주입 방식
    @Inject // 지금처럼 의존성을 주입해 줄 때
    @Named("pikachu")
    private Poketmon poketmon;

    public void poketmonAttack(){
        poketmon.attack();
    }

}
