package me.harry.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {

    @GetMapping("/")
    fun welcome():String {
        return "welcome"
    }
}