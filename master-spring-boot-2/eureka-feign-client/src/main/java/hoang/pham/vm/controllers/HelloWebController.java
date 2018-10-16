package hoang.pham.vm.controllers;

import hoang.pham.vm.services.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @Autowired
    public HelloServiceClient helloServiceClient;

    @GetMapping("/say-hello")
    public String sayHello(ModelMap modelMap){
        modelMap.addAttribute("msg", helloServiceClient.sayHello());
        return "hello";
    }


}
