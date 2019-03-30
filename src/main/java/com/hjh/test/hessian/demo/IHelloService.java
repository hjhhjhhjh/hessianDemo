package com.hjh.test.hessian.demo;

import java.util.List;

public interface IHelloService {
    String sayHello(String name);

    List<User> queryList(UserCondition cond);
}