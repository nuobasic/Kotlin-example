package com.example.demo.controller.get

import com.example.demo.model.http.UserRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")    ///localhost:8080/api
class GetApiController {

    @GetMapping("/hello")    ///localhost:8080/api/hello
    fun hello(): String {
        return "안녕하세요"
    }

    @GetMapping("/hello2")    ///localhost:8080/api/hello
    fun hello2(): String {
        return "hello kotlin"
    }

    //Path-variable
    @GetMapping("/path/{name}")  // @PathVariable 이름과 api의 이름이 같아야 한다.
    fun pathVariable(@PathVariable name: String): String {
        println(name)
        return name;
    }

    @GetMapping("/path2/{name}")  // @PathVariable 이름과 api의 이름이 같아야 한다.
    fun pathVariable2(@PathVariable(value = "name") _name: String): String {  // value를 통해 변수의 이름과 PathVariable 과 매칭 가능
        val name = "Kotlin";

        println(_name)
        return _name;
    }


    //쿼리 파라미터

    @GetMapping("/query")
    fun queryParam(@RequestParam(value = "name") name: String,
                   @RequestParam(value = "age") age: Int): String {
        println("${name}, ${age}")
        return name + ":" + age;
    }

    @GetMapping("/get/query-object") //Object로 받을 시 -을 사용 할 수 없다. -사용할 경우 RequestParam 사용
    fun queryObj(userRequest: UserRequest) : UserRequest{
        println(userRequest)
        return userRequest
    }


}