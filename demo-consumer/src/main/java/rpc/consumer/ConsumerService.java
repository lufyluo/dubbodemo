package rpc.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import rpc.service.DemoService;
@Component
public class ConsumerService {
    @Reference
    DemoService demoService;
    public String sayHello(String name){
        return demoService.sayHello(name);
    }
}
