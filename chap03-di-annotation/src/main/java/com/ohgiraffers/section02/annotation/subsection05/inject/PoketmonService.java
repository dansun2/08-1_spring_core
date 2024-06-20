package com.ohgiraffers.section02.annotation.subsection05.inject;


import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service("poketmonServiceInject")
public class PoketmonService {

    @Inject
    private Poketmon poketmon;

    public void poketmonAttack(){
        poketmon.attack();
    }

}
