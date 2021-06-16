package com.example.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name="name", required = false, defaultValue = "world") String name, Model model)
//    {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
}
