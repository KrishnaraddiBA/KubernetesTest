package com.dockerExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {


    @GetMapping("/v1")
    public String getMessage(){
        return "krishnaraddi the IT king";

    }

}
