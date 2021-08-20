package com.felix.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test1(){
        return "hello world springboot!";
    }

    @PostMapping("/posthello")
    public String test2(){
        return "post world springboot!";
    }

    @DeleteMapping("/deletehello")
    public String test3(){
        return "delete world springboot!";
    }

    @GetMapping("/param/{userId}/{passWd}")
    public String test4(@PathVariable String userId, @PathVariable String passWd){
        return "hello param get!" + userId + ":" + passWd;
    }

    @DeleteMapping("/param1/{userId}/{passWd}")
    public String test5(@PathVariable String userId, @PathVariable String passWd){
        return "hello param1 get!" + userId + ":" + passWd;
    }

    @PutMapping("/param1/{userId}/{passWd}")
    public String test6(@PathVariable("userId") String abc, @PathVariable("passWd") String def){
        return "hello param1 get!" + abc + ":" + def;
    }

    @GetMapping("/param2")
    public String test7(@RequestParam String userId, @RequestParam String passWd){
        return "hello param2 get!" + userId + ":" + passWd;
    }
}


