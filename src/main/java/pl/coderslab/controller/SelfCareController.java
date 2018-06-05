package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/self-care")
public class SelfCareController {

    @GetMapping("/")
    public String home(){
        return "self-care/home";
    }

}
