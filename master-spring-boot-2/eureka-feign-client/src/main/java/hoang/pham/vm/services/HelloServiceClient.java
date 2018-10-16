package hoang.pham.vm.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-cloud-eureka-client")
public interface HelloServiceClient {

    @GetMapping("/hello")
    public String sayHello();

}
