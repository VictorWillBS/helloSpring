package com.hello.api;
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hello")
public class HelloController{
    @getMapping()
    public String HelloSpring{
        return "Olá Spring"
    }
}
