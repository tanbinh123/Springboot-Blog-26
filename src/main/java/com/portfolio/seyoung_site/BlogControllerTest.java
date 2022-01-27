package com.portfolio.seyoung_site;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//스프링이 com.protfolio.test 패키지 이하를 스캔해서 모든파일을 메모리에 new하는 것은아니고.
// 특정 어노테이션이 붙어있는 클래스 파일들을 new헤서(ioc) 스프링 컽네팅너 에서 관리해준다.
@RestController
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>seyoung Hello</h1>";
    }
}
