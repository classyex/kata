package com.github.classyex.kata.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/29 12:29 <br>
 */
public class HelloTest {

    @Test
    public void should_say_hello_to_zhangsan() {
        Hello hello = new Hello("zhangsan");
        Assertions.assertEquals("hello zhangsan", hello.sayHello());
    }

    @Test
    public void should_say_hello_to_lisi() {
        Hello hello = new Hello("lisi");
        Assertions.assertEquals("hello lisi", hello.sayHello());
    }

}
