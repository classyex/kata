package com.github.classyex.kata.bankocr;

import java.io.IOException;
import java.net.URISyntaxException;
import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/29 16:40 <br>
 */
public class BankOcrTest {

    @Test
    public void given_path_1_when_parse_accounts_then_return_accounts_list() throws IOException, URISyntaxException {
        BankOcr bankOcr = new BankOcr("/scan1");
        BankAccountList list = bankOcr.parse();

        assertThat(1, is(equalTo(list.size())));
        assertThat("000000000", is(equalTo(list.get(0))));
    }
/*

    @Test
    public void given_path_2_when_parse_accounts_then_return_accounts_list() throws IOException, URISyntaxException {
        BankOcr bankOcr = new BankOcr("/scan2");

        BankAccountList list = bankOcr.parse();

        assertThat(3, is(equalTo(list.size())));
        assertThat("000000000", is(equalTo(list.get(0))));
        assertThat("111111111", is(equalTo(list.get(1))));
        assertThat("222222222", is(equalTo(list.get(2))));
    }
*/

}
