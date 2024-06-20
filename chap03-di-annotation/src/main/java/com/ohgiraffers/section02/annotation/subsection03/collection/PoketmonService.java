package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("poketmonServiceQualifier")
public class PoketmonService {

    private List<Poketmon> poketmonList;

    @Autowired
    public PoketmonService(List<Poketmon> poketmonList) {
        this.poketmonList = poketmonList;
    }

    public void poketmonAttack(){
        poketmonList.forEach(Poketmon::attack);
    }
}
