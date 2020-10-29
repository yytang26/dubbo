package com.tyy.service.impl;

import com.tyy.service.DemoService;

/**
 * @author:tyy
 * @date:2020/10/29 10:18
 * @version:0.0.1
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
