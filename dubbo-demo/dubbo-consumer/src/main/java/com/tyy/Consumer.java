package com.tyy;

import com.tyy.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:tyy
 * @date:2020/10/29 10:41
 * @version:0.0.1
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String hello=demoService.sayHello("world");
        System.out.println(hello);
    }
}
