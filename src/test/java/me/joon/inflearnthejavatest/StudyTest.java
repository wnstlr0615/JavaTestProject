package me.joon.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest { // 스프링 부트 2.2 부터는 test에 public를 붙이지 않아도 된다
    @Test
    void create(){
        Study study=new Study();
        assertNotNull(study);
    }
    @Test
    void create1(){
        System.out.println("create1");
    }

    @BeforeAll
    @Disabled  // 테스트 제외
    static void beforeAll(){ // static 으로 선언 해줘야 함
        System.out.println("before All");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after All");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("before each");
    }
    @AfterEach
    void afterEach(){
        System.out.println("after each");
    }
}