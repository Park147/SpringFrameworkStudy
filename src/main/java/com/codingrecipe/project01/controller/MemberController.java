package com.codingrecipe.project01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/member/save") // /member/member/save
//    @GetMapping("/save")
    public  String saveForm() {
        return  "save";
    }
}
