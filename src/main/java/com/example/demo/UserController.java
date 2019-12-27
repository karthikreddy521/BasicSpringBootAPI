package com.example.demo;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class UserController {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable final String name){
        return "Hello.."+name;

    }


}
