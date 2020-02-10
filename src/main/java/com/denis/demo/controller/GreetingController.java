package com.denis.demo.controller;

import com.denis.demo.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("name", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greeetingSubmit(@ModelAttribute Greeting greeting){
        return "result";
    }
}
