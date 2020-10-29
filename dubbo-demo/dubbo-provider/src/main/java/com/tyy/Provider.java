package com.tyy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author:tyy
 * @date:2020/10/29 10:30
 * @version:0.0.1
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.in.read();
    }
}
