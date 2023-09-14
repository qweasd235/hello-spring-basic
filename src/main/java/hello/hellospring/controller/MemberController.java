package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // new 사용 시 인스턴스 생성하는 것으로 DI로 하여 작업하는 것이 효율적
    // DI는 필드 주입, 생성자 주입, setter 주입 방법 등이 있다.
    // 필드 주입은 설정 시 변경할 수 없기 때문에 비추
    // setter 주입 단점은 public으로 노출되어 아무데서나 호출되도록 되어 문제가 됨
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
