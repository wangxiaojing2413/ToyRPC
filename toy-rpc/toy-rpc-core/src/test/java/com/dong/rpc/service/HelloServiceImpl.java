package com.dong.rpc.service;

import com.dong.rpc.exception.HelloException;

/**
 * @author caolidong
 * @date 17/6/29.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) throws HelloException {
        if (name.equals("exception")) {
            throw new HelloException("hello");
        }
        return "hello, " + name;
    }
}
