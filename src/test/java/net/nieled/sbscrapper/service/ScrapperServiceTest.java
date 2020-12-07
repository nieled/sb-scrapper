package net.nieled.sbscrapper.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScrapperServiceTest {

    @Test
    public void entriesLength() throws Exception {
        ScrapperService scrapperService = new ScrapperService();
        var result = scrapperService.getData();
        assertTrue(result.size() <= 30);
    }

    @Test
    public void numberConversion() {
        ScrapperService scrapperService = new ScrapperService();
        assertEquals(0, scrapperService.asNumber(""));
        assertEquals(0, scrapperService.asNumber("hide"));
        assertEquals(1, scrapperService.asNumber("1"));
        assertEquals(42, scrapperService.asNumber("42"));
    }

}
