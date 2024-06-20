package com.ohgiraffers.section02.annotation.subsection05.inject;


import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service("poketmonServiceInject")
public class PoketmonService {

    //1. 필드 주입 방식
//    @Inject // 지금처럼 의존성을 주입해 줄 때
//    @Qualifier("charmander")
    private Poketmon poketmon;
    @Inject
    public PoketmonService(@Qualifier("charmander") Poketmon poketmon) {
        this.poketmon = poketmon;
    }

    public void poketmonAttack(){
        poketmon.attack();
    }

}
