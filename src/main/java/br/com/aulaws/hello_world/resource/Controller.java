package br.com.aulaws.hello_world.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class Controller {
    
    @GetMapping
    public String getMethodName() {
        return "Hello World API REST";
    }
    
}
