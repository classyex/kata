package com.github.classyex.kata.bankocr;

import java.util.Arrays;
import java.util.Collections;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/29 18:17 <br>
 */
public class BankAccountListTest {

    @Test
    public void given_3_line_27_column_string_when_spit_num_then_return_9_num_line() {
        BankAccountList list = new BankAccountList(Arrays.asList(" _  _  _  _  _  _  _  _  _ ",
                "| || || || || || || || || |", "|_||_||_||_||_||_||_||_||_|"));
        assertThat(1, is(equalTo(list.size())));
    }

}
