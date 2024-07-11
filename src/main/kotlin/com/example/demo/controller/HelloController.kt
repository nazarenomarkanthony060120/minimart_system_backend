package com.example.demo.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class LoginRequest(val email: String, val password: String)
data class LoginResponse(val message: String)

@RestController
class HelloController {
    @RequestMapping("/api/hello")
    fun hello(): String {
        return "Hello from Spring Boot"
    }

    @PostMapping("/api/login")
    fun login(): String {
        val message: String = "Success"
        return message
    }
}
