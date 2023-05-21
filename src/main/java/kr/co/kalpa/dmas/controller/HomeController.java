package kr.co.kalpa.dmas.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class HomeController {

    public String index() {
        return "index";
//        return "redirect:" + "login";
    }
}
