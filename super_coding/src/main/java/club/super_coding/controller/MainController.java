package club.super_coding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    //Controller

    @GetMapping("/main")
    public String getMain() {
        return "김주환";
    }


    @PostMapping("/main")
    public String PostMain(String str) {
        return str;
    }
}
