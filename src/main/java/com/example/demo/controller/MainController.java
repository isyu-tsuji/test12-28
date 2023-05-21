package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/hello")
    public String showHello(Model model) {
        model.addAttribute("title", "Hello World");
        model.addAttribute("message", "こんにちは");
        return "hello";
    }

    @RequestMapping("/next")
    public String nextHello(Model model) {
        model.addAttribute("seni", "遷移完了");
        return "next";
    }
}
