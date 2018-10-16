package hoang.pham.vn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceClient {

    @Autowired
    @LoadBalanced
    RestTemplate restTemplate;

    public String sayHello(){
        return restTemplate.getForObject("http://spring-cloud-eureka-client/hello",String.class);
    }
}
