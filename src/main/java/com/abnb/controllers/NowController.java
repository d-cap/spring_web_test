package com.abnb.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class NowController {


    @RequestMapping(value = "/now", produces = MediaType.TEXT_PLAIN_VALUE)
    public String now() {
        return LocalDateTime.now().toString();
    }
}
