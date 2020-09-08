package com.example.springboot_jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping(value="/")
    public String getMethodName(Model model) {
        System.out.println("ss");
        return "home";
    }
    
}
