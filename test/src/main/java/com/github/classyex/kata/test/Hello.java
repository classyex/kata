package com.github.classyex.kata.test;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/29 14:21 <br>
 */
public class Hello {
    private final String name;

    public Hello(final String name) {
        this.name = name;
    }

    public String sayHello() {
        return "hello " + name;
    }
}
