package com.bp.msa.news.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @GetMapping("/")
    public String root() {
        return "News Information";
    }
}
