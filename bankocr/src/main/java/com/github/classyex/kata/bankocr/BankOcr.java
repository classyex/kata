package com.github.classyex.kata.bankocr;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/29 16:50 <br>
 */
public class BankOcr {
    private final String inputPath;

    public BankOcr(final String inputPath) {
        this.inputPath = inputPath;
    }

    public BankAccountList parse() throws IOException, URISyntaxException {
        URI uri = this.getClass().getResource(inputPath).toURI();
        List<String> lines = Files.readAllLines(Paths.get(uri));
        return new BankAccountList(lines);
    }
}
