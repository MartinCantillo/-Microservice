package com.test.microservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Person")
public class PersonController {


    @GetMapping("/Hello")
    public String HelLoWorld() {
        return "Hello World";
    }


}
