package rpc.provider;

import rpc.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout = 5000,version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello , " + name;
    }
}
