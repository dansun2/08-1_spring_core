package com.ohgiraffers.section02.annotation.subsection02.qualifier;


import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("poketmonServiceQualifier")
public class PoketmonService {

    private Poketmon poketmon;

    @Autowired
    public PoketmonService(Poketmon poketmon) { this.poketmon = poketmon; }

    public void poketmonAttack(){
        poketmon.attack();
    }

}
