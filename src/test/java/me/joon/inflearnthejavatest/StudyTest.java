package me.joon.inflearnthejavatest;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) //테스트 이름을 공백을 기준으로 분리 시켜줌
class StudyTest { // 스프링 부트 2.2 부터는 test에 public를 붙이지 않아도 된다
    @DisplayName("스터디 만들기")
   // @Tag("fast")
    @FastTest
    void create_new_study(){
        Study study=new Study();
        study.setLimit(15);
        assertAll(
                ()->assertNotNull(study),
                ()->assertEquals(StudyStatus.DRAFT, study.getStudyStatus(), ()->"스터디의 default 값은 DRAFT 여야 한다."), // 람다로 표현 해야할 경우 필요한 경우에만 실행
        //           기댓값   결과 값   message
                ()->assertTrue(study.getLimit()>0,"")
    );
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> study.setLimit(-10));
        assertEquals(illegalArgumentException.getMessage(),"limit는 0 이상이어야 한다");
        assertTimeout(Duration.ofMillis(100), ()-> {
            new Study();
            //Thread.sleep(500);
    });


    }
    @Test
    @Tag("fast")
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