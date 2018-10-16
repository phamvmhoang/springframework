package hoang.pham.vn.controllers;

import hoang.pham.vn.services.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    public HelloServiceClient helloServiceClient;

    @RequestMapping("say-hello")
    public String sayHello(){
        return helloServiceClient.sayHello();
    }
}
