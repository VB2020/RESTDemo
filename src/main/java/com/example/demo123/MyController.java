package com.example.demo123;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @GetMapping
    public String getStr(String str)
    {
        return str;
    }

    @GetMapping("/click")
    public String ClickButton()
    {
        return getStr("some string");
    }
}
