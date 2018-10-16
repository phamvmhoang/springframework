package hoang.pham.vm;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/getInfo")
    public String sericeUrl(){
        Application application = eurekaClient.getApplication("spring-cloud-eureka-client");
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String hostName = instanceInfo.getHostName();
        int port = instanceInfo.getPort();
        return instanceInfo.getHomePageUrl();
    }


}
