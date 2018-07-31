package rpc.provider;

import rpc.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello , " + name;
    }
}
