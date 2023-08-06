package kopo.poly.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class MainController {

    public String main() throws Exception {
        log.info(this.getClass().getName() + ".Main 페이지 보여주는 함수 실행");
        return "/main";
    }
}
