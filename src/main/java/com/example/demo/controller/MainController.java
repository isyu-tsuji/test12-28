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
    public String nextHello(String userId, Model model) {
        model.addAttribute("title", "遷移完了");
        model.addAttribute("userId", userId);
        return "next";
    }

    @RequestMapping("/next2")
    public String next2Hello() {
        return "next2";
    }

    @RequestMapping("/final")
    public String finHello() {
        return "final";
    }

}
