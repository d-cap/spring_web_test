package com.abnb.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Controller
public class IndexController {
    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }
}
