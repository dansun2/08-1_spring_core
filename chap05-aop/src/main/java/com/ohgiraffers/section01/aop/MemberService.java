package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service // 특별한 기능을 갖진 않음. 도메인 로직을 표현하기 위한 서비스 계층이다 라는 것을 명시
public class MemberService {
    private final MemberDAO memberDAO;

    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public Map<Long, MemberDTO> selectMembers(){
        System.out.println("select 메소드 실행");
        return memberDAO.selectMembers();
    }

    public MemberDTO selectMember(Long id){
        System.out.println("selectMember 메소드 실행");
        return memberDAO.selectMember(id);
    }


}
