package com.hjh.test.hessian.demo.client;

import com.hjh.test.hessian.demo.User;
import com.hjh.test.hessian.demo.UserCondition;

import java.util.List;

public interface IHelloService {
    String sayHello(String name);

    List<User> queryList(UserCondition cond);
}