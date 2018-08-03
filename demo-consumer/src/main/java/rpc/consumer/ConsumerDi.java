package rpc.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerDi {

    public static void main(String[] args) {
        while (true) {
            System.setProperty("java.net.preferIPv4Stack", "true");
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
            context.start();
            try {
                Thread.sleep(1000);
                String hello = new ConsumerService().sayHello("world"); // call remote method
                System.out.println(hello); // get result

            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }


        }
    }
}
