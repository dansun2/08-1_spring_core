package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component // 빈으로 해당 클래스를 등록해줄때
public class Squirtle implements Poketmon{

    @Override
    public void attack() {
        System.out.println("꼬부기 물대포 발사");
    }
}
