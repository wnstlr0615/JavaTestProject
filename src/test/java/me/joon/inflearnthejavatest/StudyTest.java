package me.joon.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) //테스트 이름을 공백을 기준으로 분리 시켜줌
class StudyTest { // 스프링 부트 2.2 부터는 test에 public를 붙이지 않아도 된다
    @Test
    @DisplayName("스터디 만들기")
    void create_new_study(){
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