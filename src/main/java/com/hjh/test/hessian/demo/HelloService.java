package com.hjh.test.hessian.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("HelloService")
public class HelloService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello World! " + name;
    }

    @Override
    public List<User> queryList(UserCondition cond) {
        System.out.println(cond);
        List<User> list = new ArrayList<>();
        list.add(new User(1, "张三", new Date()));
        list.add(new User(2, "李四", new Date()));
        return list;
    }
}