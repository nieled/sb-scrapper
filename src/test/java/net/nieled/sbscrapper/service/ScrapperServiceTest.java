package net.nieled.sbscrapper.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScrapperServiceTest {

    @Test
    public void entriesLength() {
        ScrapperService scrapperService = new ScrapperService();
        var result = scrapperService.getData();
        assertTrue(result.size() <= 30);
    }

}
