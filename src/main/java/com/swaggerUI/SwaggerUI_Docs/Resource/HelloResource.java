package com.swaggerUI.SwaggerUI_Docs.Resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return  "Hello World";
    }
    @GetMapping("/post")
    public String helloPost(@RequestBody final String hello){

        return  "HELLO";
    }

    @GetMapping("/put")
    public String helloPut(@RequestBody final String hello){

        return  "HELLO";
    }
}
