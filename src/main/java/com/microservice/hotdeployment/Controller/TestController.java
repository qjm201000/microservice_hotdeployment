package com.microservice.hotdeployment.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("index3")
    public String index3(){
        return "index3";
    }

    @RequestMapping("index2")
    public String index2(){
        return "index2";
    }
}
