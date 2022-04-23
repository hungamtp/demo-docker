package com.example.demodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "<h1 style=\"color:blue;\">hung<h1>";
    }
    @GetMapping("/fr")
    public String fr(){
        return
            "<img src=\"https://firebasestorage.googleapis.com/v0/b/mroki-a39d3.appspot.com/o/D8956427-11EE-4EE2-A229-54E92360D6A8.jpeg?alt=media&token=4bf845cb-d1b3-4f19-83ee-e32849343e2c alt=\"hung\"/>";
    }
}
