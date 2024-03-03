package com.example.demo.controller.get

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")    ///localhost:8080/api
class GetApiController {

    @GetMapping("/hello")    ///localhost:8080/api/hello
    fun hello() : String{
        return "안녕하세요"
    }

    @GetMapping("/hello2")    ///localhost:8080/api/hello
    fun hello2() : String{
        return "hello kotlin"
    }
}