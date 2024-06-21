package com.ohgiraffers.section01.aop;

/*
* AOP(Aspect-oriented Programming 관점 지향 프로그래밍)
* 프로그램의 관심사를 분리하여 모듈화하는것을 목표로 한다.
* aop는 특히 애플리케이션의 핵심 비즈니스 로직과는 별도로 부가적인 기능 (예: 로깅, 보안, 트랜젝션 관리 등)을 분리하여
* 코드의 모듈성을 높이고 유지보수성을 향상시키는데 유용하다.
* AOP는 JPA에서 많이 쓴다. 
* */

/*
* pointcut : 특정 조건에 의해 필터링된 조인포인트, 수많은 조인포인트 중에 특정 메소드만 횡단 공통기능을 수행하기 위해서 사용된다.
* advice : 횡단 관심에 해당하는 공통 기능의 코드, 독립된 클래스의 메소드로 작성한다.
*   - before : 메소드 실행 전에 동작
*   - After : 메소드 실행 후에 동작
*   - After -returning : 메소드가 정상적으로 실행된 후에 동작
*   - After -throwing : 예외가 발생한 후에 동작
*   - Aroung : 메소드 호출 이전, 이후, 예외발생 등 모든 시점에 동작
* */
public class LogginAspect {
}
